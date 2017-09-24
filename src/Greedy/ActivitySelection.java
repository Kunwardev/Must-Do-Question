/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Kunwar
 */
public class ActivitySelection
{
    private void function(int[] start, int[] finish){
        int i,j;
        i=0;
        System.out.print(i+" ");
        for(j=1;j<finish.length;j++){
            if(start[j] >= finish[i]){
                i = j;
                System.out.print(i+" ");
            }
        }
    }
    
    static class Activity{
        int start, finish;
    }
    
    class compare implements Comparator<Activity>{

        public int compare(Activity o1, Activity o2)
        {
            return o1.finish - o2.finish;
        }
        
    }
    
    private void functionUnsorted(Activity[] act){
        Arrays.sort(act, new compare());
        int i,j;
        i=0;
        System.out.print("("+act[i].start+", "+act[i].finish+") ");
        for(j=1;j<act.length;j++){
            if(act[i].finish <= act[j].start){
                i = j;
                System.out.print("("+act[i].start+", "+act[i].finish+") ");
            }
        }
    }
    
    public static void main(String[] args)
    {
        int[] start = new int[]{1,3,0,5,8,5};
        int[] finish = new int[]{2,4,6,7,9,9};
        Activity[] arr = new Activity[4];
        arr[0] = new Activity();arr[1] = new Activity();arr[2] = new Activity();
        arr[3] = new Activity();
        arr[0].start = 5;arr[0].finish = 9;
        arr[1].start = 8;arr[1].finish = 9;
        arr[2].start = 5;arr[2].finish = 7;
        arr[3].start = 0;arr[3].finish = 6;
        ActivitySelection a = new ActivitySelection();
        a.functionUnsorted(arr);
    }
    
}
