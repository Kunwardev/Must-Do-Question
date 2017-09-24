/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Iterator;

/**
 *
 * @author Kunwar
 */
public class DFS
{
    private void function(GraphNode g, int s){
        boolean[] visited = new boolean[g.V];
        functionUtil(g, visited, s);
    }

    private void functionUtil(GraphNode g, boolean[] visited, int s)
    {
        visited[s] = true;
        System.out.print(s+" ");
        Iterator<Integer> i = g.adj[s].listIterator();
        while(i.hasNext()){
            int n = i.next();
            if(!visited[n]){
                functionUtil(g, visited, n);
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
        DFS d = new DFS();
        d.function(g, 2);
    }
    
}
