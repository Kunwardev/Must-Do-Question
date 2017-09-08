/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class PythagoreanTriplet
{
    private boolean check(int[] arr){
        Arrays.sort(arr);
        int[] squared = new int[arr.length];
        for(int j=0;j<arr.length;j++){
            squared[j] = (arr[j]*arr[j]);
        }
        
        for(int i=arr.length-2;i>=0;i--){
            int low = 0;
            int high = i-1;
            while(low < high){
                if(squared[low] + squared[high] == squared[i]){
                    return true;
                }
                else if(squared[low]+squared[high] > squared[i])high--;
                else low++;
            }
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{3,1,4,6,5};
        PythagoreanTriplet p = new PythagoreanTriplet();
        System.out.println(p.check(arr));
    }
    
}
