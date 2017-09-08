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
public class MinPlatforms
{
    private int function(int[] arr, int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int i =1, j=0, plat = 1, result = 1;
        while(i < arr.length && j < arr.length){
            if(arr[i] < dep[j]){
                plat++;
                i++;
                if(plat > result){
                    result = plat;
                }
            }else{
                plat--;
                j++;
            }
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        
    }
    
}
