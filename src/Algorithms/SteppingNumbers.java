/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class SteppingNumbers
{
    private void bfs(int n, int m, int num){
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        while(!q.isEmpty()){
            int stepNum = q.poll();
            if(stepNum >= n && stepNum <= m)
                System.out.print(stepNum+" ");
            if(stepNum == 0 || stepNum > m)
                continue;
            int lastDigit = stepNum % 10;
            int stepNumA = stepNum * 10 + (lastDigit - 1);
            int stepNumB = stepNum * 10 + (lastDigit + 1);
            if(lastDigit == 0)
                q.offer(stepNumB);
            else if(lastDigit == 9)
                q.offer(stepNumA);
            else{
                q.offer(stepNumA);
                q.offer(stepNumB);
            }
        }
    }
    
    private void function(int n, int m){
        for(int i=0;i<=9;i++)
            bfs(n, m, i);
    }
    
    public static void main(String[] args)
    {
        int n = 0, m = 21;
        SteppingNumbers s = new SteppingNumbers();
        s.function(n, m);
    }
    
}
