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
public class TrappingRainWater
{
    private int function(int[] arr){
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0] = arr[0];
        right[arr.length-1] = arr[arr.length-1];
        for(int i=1;i<arr.length;i++)
            left[i] = Math.max(left[i-1], arr[i]);
        for(int j=arr.length-2;j>=0;j--)
            right[j] = Math.max(right[j+1], arr[j]);
        int water = 0;
        for(int i=0;i<arr.length;i++){
            water += (Math.min(left[i], right[i]) - arr[i]);
        }
        return water;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        TrappingRainWater t = new TrappingRainWater();
        System.out.println(t.function(arr));
    }
    
}
