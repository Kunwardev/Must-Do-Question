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
public class ElementAppearingOnceInSortedArray
{
    private void search(int[] arr, int low, int high){
        if(low == high){
            System.out.println("The Element is "+arr[low]);
            return;
        }
        int mid = (low+high)/2;
        if((mid % 2) ==0){
            if(arr[mid] == arr[mid+1])
                search(arr, mid+2, high);
            else
                search(arr, low, mid);
        }else{
            if(arr[mid] == arr[mid-1])
                search(arr, mid-2, high);
            else
                search(arr, low, mid-1);
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 1, 2, 4, 4, 5, 5, 6, 6};
        ElementAppearingOnceInSortedArray e = new ElementAppearingOnceInSortedArray();
        e.search(arr, 0, arr.length-1);
    }
    
}