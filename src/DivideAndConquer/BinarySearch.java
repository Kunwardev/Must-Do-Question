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
public class BinarySearch
{
    private int function(int[] arr, int l, int h, int k){
        int mid = (l+h)/2;
        if(arr[mid] == k)
            return mid;
        else if(arr[mid] > k){
            return function(arr, l,mid-1,k);
        }else{
            return function(arr, mid+1, h,k);
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        BinarySearch b = new BinarySearch();
        System.out.println(b.function(arr, 0, arr.length-1, 4));
    }
    
}
