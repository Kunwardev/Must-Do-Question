/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class MaximizeToys
{
    private int function(int[] arr, int k){
        Arrays.sort(arr);
        int i=0;
        if(arr[0] > k)
            return -1;
        while(k > 0 && i != arr.length){
            k -= arr[i++];
        }
        return (k <=0 )?i-1 : i;
    }
    
    public static void main(String[] args)
    {
        MaximizeToys m = new MaximizeToys();
        int[] arr = new int[]{1,12,5,10,100};
        System.out.println(m.function(arr, 50));
    }
    
}
