/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

/**
 *
 * @author Kunwar
 */
public class EquilibriumPoint
{
    private int function(int[] arr){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            left[i] = arr[i]+left[i-1];
        }
        right[arr.length-1] = arr[arr.length-1];
        for(int j=arr.length-2;j>=0;j--){
            right[j] = arr[j] + right[j+1];
        }
//        for(int j:left){
//            System.out.print(j+" ");
//        }
//        System.out.println();
//        for(int k:right){
//            System.out.print(k+" ");
//        }
        for(int i=0;i<arr.length;i++){
            if((left[i] - arr[i]) == (right[i] - arr[i]))
                return i;
        }
        return -1;
    }
    
    public static void main(String[] args)
    {
        EquilibriumPoint e = new EquilibriumPoint();
        int[] arr = new int[]{1};
        System.out.println(e.function(arr));
    }
    
}
