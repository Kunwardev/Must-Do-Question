/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Kunwar
 */
public class MinimizeTheSumOfProduct
{
    private int function(int[] arr1, int [] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int sum = 0;
        for(int i=0;i<arr1.length;i++){
            sum += (arr1[i]*arr2[arr1.length-1-i]);
        }
        return sum;
    }
    
    public static void main(String[] args)
    {
        MinimizeTheSumOfProduct m = new MinimizeTheSumOfProduct();
        int[] arr1 = new int[]{6,1,9,5,4};
        int[] arr2 = new int[]{3,4,8,2,4};
        System.out.println(m.function(arr1, arr2));
    }
    
}
