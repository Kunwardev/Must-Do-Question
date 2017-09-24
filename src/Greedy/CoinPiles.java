/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy;

/**
 *
 * @author Kunwar
 */
public class CoinPiles
{
    class INT{
        int max, max_index;
    }
    
    private int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    
    private INT findMax(int[] arr){
        INT max = new INT();
        max.max = Integer.MIN_VALUE;
        max.max_index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max.max){
                max.max = arr[i];
                max.max_index = i;
            }
        }
        return max;
    }
    
    private int function(int[] arr, int k){
        int count = 0;
        int MIN = findMin(arr);
        INT max = findMax(arr);
        while((max.max-MIN) > k){
            arr[max.max_index] -= (max.max-MIN-k);
            count += (max.max-MIN-k);
            max = findMax(arr);
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        CoinPiles c = new CoinPiles();
        int[] arr = new int[]{1,5,1,2,5,1};
        System.out.println(c.function(arr, 3));
    }
    
}
