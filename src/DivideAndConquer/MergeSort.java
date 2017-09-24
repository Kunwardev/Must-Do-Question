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
public class MergeSort
{
    private void sort(int[] arr, int l, int h){
        if(l < h){
            int mid = (l+h)/2;
            sort(arr, l, mid);
            sort(arr, mid+1, h);
            Merge(arr, l, mid, h);
        }
    }
    private void Merge(int[] arr, int l, int mid, int h)
    {
        int n1 = mid - l + 1;
        int n2 = h - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0;i<n1;i++)
            L[i] = arr[l+i];
        for(int j=0;j<n2;j++)
            R[j] = arr[mid+1+j];
        int i=0,j=0;
        int k=l;
        while(i<n1 && j<n2){
            if(L[i] < R[j]){
                arr[k++] = L[i++];
            }else{
                arr[k++] = R[j++];
            }
        }
        while(i<n1){
            arr[k++] = L[i++];
        }
        while(j<n2){
            arr[k++] = R[j++];
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{10,40,30,20,50,70,60};
        MergeSort m = new MergeSort();
        m.sort(arr, 0, arr.length-1);
        for(int p: arr){
            System.out.print(p+" ");
        }
    }
    
}
