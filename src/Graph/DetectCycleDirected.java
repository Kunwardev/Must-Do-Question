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
public class DetectCycleDirected
{
    private boolean cycleUtil(GraphNode g, int v, boolean[] visited, boolean[] recStack){
        if(!visited[v]){
            visited[v] = true;
            recStack[v] = true;
            Iterator<Integer> it = g.adj[v].listIterator();
            while(it.hasNext()){
                int n = it.next();
                if(!visited[n] && cycleUtil(g, n, visited, recStack))
                    return true;
                else if(recStack[n])
                    return true;
            }
        }
        recStack[v] = false;
        return false;
    }
    
    private boolean isCyclic(GraphNode g){
        boolean[] visited = new boolean[g.V];
        boolean[] recStack= new boolean[g.V];
        for(int i=0;i<g.V;i++)
            if(cycleUtil(g, i, visited, recStack))
                return true;
        return false;
    }
    
    public static void main(String[] args)
    {
        GraphNode g = new GraphNode(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        //g.addEdge(1, 2);
        //g.addEdge(2, 0);
        g.addEdge(2, 3);
        //g.addEdge(3, 3);
        DetectCycleDirected d = new DetectCycleDirected();
        System.out.println(d.isCyclic(g));
    }
    
}
