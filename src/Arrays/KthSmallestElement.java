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
public class KthSmallestElement
{
    
    private int quickSort(int[] arr, int low, int high, int k){
        if(low < high){
            int pi = partition(arr, low, high);
            if((pi-1) == (k-1)){
                return arr[pi-1];
            }
            else if((pi-1) > (k-1))
                return quickSort(arr, low, pi-1, k);
            return quickSort(arr, pi+1, high, k);
        }
        return -1;
    }
    
    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j=low; j<high;j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return(i+1);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{4,9,1,2,6,3};
        KthSmallestElement k = new KthSmallestElement();
        System.out.println(k.quickSort(arr, 0, arr.length-1, 3));
        
    }
    
}
