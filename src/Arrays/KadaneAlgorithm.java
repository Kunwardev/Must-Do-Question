/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.Scanner;

/**
 *
 * @author Kunwar
 */
public class KadaneAlgorithm
{
    private int maxNumber(int[] arr){
        int max_sum_so_far = 0;
        int max_ending_sum = 0;
        for(int i=0;i<arr.length;i++){
            max_ending_sum += arr[i];
            if(max_ending_sum < 0){
                max_ending_sum = 0;
            }
            if(max_ending_sum > max_sum_so_far){
                max_sum_so_far = max_ending_sum;
            }
        }
        return (max_sum_so_far == 0 ) ? -1 :max_sum_so_far;
    }
    
    public static void main(String[] args)
    {
        KadaneAlgorithm k = new KadaneAlgorithm();
        Scanner sc = new Scanner(System.in);
        int Test = sc.nextInt();
        for(int i=0;i<Test;i++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int j=0;j<N;j++){
                arr[j] = sc.nextInt();
            }
            System.out.println(k.maxNumber(arr));
        }
    }
    
}
