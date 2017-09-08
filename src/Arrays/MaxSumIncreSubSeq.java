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
public class MaxSumIncreSubSeq
{
    private int function(int[] arr){
        int[] dp = new int[arr.length];
        for(int i=0;i<arr.length;i++)
            dp[i] = arr[i];
        
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j] && dp[i] < dp[j] + arr[i])
                    dp[i] = dp[j] + arr[i];
            }
        }
        int max = dp[0];
        for(int i=1;i<arr.length;i++){
            if(max < dp[i])
                max = dp[i];
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        MaxSumIncreSubSeq m = new MaxSumIncreSubSeq();
        int[] arr = new int[]{1, 101, 2, 3, 100, 4, 5};
        System.out.println(m.function(arr));
    }
    
}
