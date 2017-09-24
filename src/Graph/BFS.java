/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Kunwar
 */
public class BFS
{
    private void function(GraphNode g, int s){
        boolean[] visited = new boolean[g.V];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while(!q.isEmpty()){
            Integer p = q.poll();
            System.out.print(p+" ");
            Iterator<Integer> i = g.adj[p].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    q.add(n);
                    visited[n] = true;
                }
            }
        }
    }
    
    public static void main(String[] args)
    {
        GraphNode g = new GraphNode(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        BFS b = new BFS();
        b.function(g, 2);
    }
    
}
