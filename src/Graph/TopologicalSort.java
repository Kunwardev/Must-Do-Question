/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class TopologicalSort
{
    private void function(GraphNode g){
        boolean[] visited = new boolean[g.V];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<g.V;i++){
            if(!visited[i])
                functionUtil(g, visited, st, i);
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    private void functionUtil(GraphNode g, boolean[] visited, Stack<Integer> st, int i)
    {
        Iterator<Integer> it = g.adj[i].listIterator();
        visited[i] = true; 
        while(it.hasNext()){
            int n = it.next();
            if(!visited[n])
                functionUtil(g, visited, st, n);
        }
        st.push(i);
    }
    
    public static void main(String[] args)
    {
        TopologicalSort t =  new TopologicalSort();
        GraphNode g = new GraphNode(6);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);
        t.function(g);
    }
    
}
