/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.HashMap;

/**
 *
 * @author Kunwar
 */
public class SubArrayWithGivenSum_WithNeg
{
    private void find(int[] arr, int sum){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int curr_sum = 0;
        for(int i=0;i<arr.length;i++){
            curr_sum += arr[i];
            if(curr_sum == sum){
                System.out.println("Found Between 0 and "+i);
                return;
            }
            if(hm.containsKey(curr_sum-sum)){
                System.out.println(hm.get(curr_sum-sum)+1 +" "+i);
            }
            hm.put(curr_sum, i);
        }
    }
    
    public static void main(String[] args)
    {
        SubArrayWithGivenSum_WithNeg s = new SubArrayWithGivenSum_WithNeg();
        int[] arr = new int[]{10,2,-2,-20,5};
        s.find(arr, -15);
    }
    
}
