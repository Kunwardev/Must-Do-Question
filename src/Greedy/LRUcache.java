/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class LRUcache
{
    private int function(int[] arr, int capacity){
        ArrayList<Integer> q = new ArrayList<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(!q.contains(arr[i])){
                if(q.size() < capacity){
                    q.add(0, arr[i]);
                }else{
                    q.remove(q.size()-1);
                    q.add(0, arr[i]);
                }
                count++;
            }else{
                int index = q.indexOf(arr[i]);
                q.remove(index);
                q.add(0, arr[i]);
            }
            System.out.println(q);
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{5,0,1,3,2,4,1,0,5};
        LRUcache l = new LRUcache();
        System.out.println(l.function(arr, 4));
    }
    
}