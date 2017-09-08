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
public class SubArrayWithGivenSum
{
    private void find(int[] arr, int sum){
        int curr_sum = arr[0], start = 0, i;
        for(i=1;i<arr.length;i++){
            while(curr_sum > sum && start < i-1){
                curr_sum -= arr[start];
                start++;
            }
            if(curr_sum == sum){
                System.out.println(start + " "+(i-1));
            }
            if(i < arr.length)
                curr_sum += arr[i];
        }
    }
    
    public static void main(String[] args)
    {
        SubArrayWithGivenSum s = new SubArrayWithGivenSum();
        int[] arr = new int[]{15, 2, 4, 8, 9, 5, 10, 23};
        int sum = 23;
        s.find(arr, sum);
        
    }
    
}
