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
public class GetMinDifferenceByAddingOrSubtracting
{
    private int function(int[] arr, int n, int k){
        if(n == 1)
            return 0;
        Arrays.sort(arr);
        int ans = arr[n-1] - arr[0];
        int small = arr[0] + k;
        int big = arr[n-1] - k;
        if(small > big){
            int x = small;
            small = big;
            big = x;
        }
        for(int i=1;i<n-1;i++){
            int subtract = arr[i] - k;
            int add = arr[i] + k;
            if(subtract >= small || add <= big)
                continue;
            if(big-subtract <= add-small)
                small = subtract;
            else
                big = add;
        }
        return Math.min(ans, big-small);
    }
    
    public static void main(String[] args)
    {
        GetMinDifferenceByAddingOrSubtracting g = new GetMinDifferenceByAddingOrSubtracting();
        int[] arr = new int[]{1,5,15,10};
        System.out.println(g.function(arr, arr.length, 3));
    }
    
}
