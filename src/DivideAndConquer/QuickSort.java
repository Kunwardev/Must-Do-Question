/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DivideAndConquer;

/**
 *
 * @author Kunwar
 */
public class QuickSort
{
    private void function(int[] arr, int low, int high){
        if(low < high){
            int pi = partition(arr, low, high);
            function(arr, low, pi-1);
            function(arr, pi+1, high);
        }
    }
    
    private int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j] <= pivot){
                i++;
                int x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
            }
        }
        int x = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = x;
        return (i+1);
    }
    
    public static void main(String[] args)
    {
        QuickSort q = new QuickSort();
        int[] arr = new int[]{10,80,30,90,50,40,70,20};
        q.function(arr, 0, arr.length-1);
        for(int p: arr)
            System.out.print(p+" ");
    }
    
}
