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
public class Sort012
{
    private void function(int[] arr){
        int start = 0, mid = 0, high = arr.length-1;
        while(mid <= high){
            switch(arr[mid]){
                case 0:
                    int temp = arr[start];
                    arr[start] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    start++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temps = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temps;
                    high--;
                    break;
            }
        }        
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{0,1,2,1,0,0,0,1,2,1,1,0};
        Sort012 s = new Sort012();
        s.function(arr);
        for(int p: arr){
            System.out.print(p+" ");
        }
    }
    
}
