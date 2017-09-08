/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class MaxinSubArrayofSizek
{
    private void function(int[] arr, int k){
        Deque<Integer> d = new LinkedList<Integer>();
        int i;
        for(i=0;i<k;i++){
            while((!d.isEmpty()) && arr[i] >= arr[d.peekLast()])
                d.removeLast();
            d.addLast(i);
        }
        
        for(;i<arr.length;i++){
            System.out.print(arr[d.peek()]+" ");
            while(!d.isEmpty() && d.peek() <= i-k)
                d.removeFirst();
            while(!d.isEmpty() && arr[i] >= arr[d.peekLast()])
                d.removeLast();
            d.addLast(i);
        }
        System.out.println(arr[d.peek()]);
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[] {12, 1, 78, 90, 57, 89, 56};
        int k=3;
        MaxinSubArrayofSizek m = new MaxinSubArrayofSizek();
       m.function(arr, k);
    }
    
}
