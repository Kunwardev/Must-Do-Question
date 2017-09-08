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
public class ReverseConsecutiveK
{
    private void function(int[] arr, int k){
        int lstart = 0,lend = k-1;
        int rem = arr.length % k;
        while(lend < arr.length-rem){
            int p = lstart, q = lend;
            while(p < q){
                int temp = arr[p];
                arr[p] = arr[q];
                arr[q] = temp;
                p++;q--;
            }
            lstart+=k;
            lend += k;
        }
        int leI = arr.length-1;
        if(rem != 0){
            for(;lstart < leI;lstart++,leI--){
                int temp = arr[lstart];
                arr[lstart] = arr[leI];
                arr[leI] = temp;
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr= new int[]{1,2,3,4,5,6,7,8};
        ReverseConsecutiveK r = new ReverseConsecutiveK();
        r.function(arr, 3);
        for(int j: arr){
            System.out.print(j+" ");
        }
    }
    
}
