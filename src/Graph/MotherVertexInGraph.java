/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Kunwar
 */
public class MotherVertexInGraph
{
    private void DFSUtil(GraphNode g, int i, boolean[] visited){
        visited[i] = true;
        Iterator<Integer> it = g.adj[i].listIterator();
        while(it.hasNext()){
            int n = it.next();
            DFSUtil(g, n, visited);
        }
    }
    
    private int findMother(GraphNode g){
        boolean[] visited = new boolean[g.V];
        int v = 0;
        for(int i=0;i<g.V;i++){
            if(! visited[i]){
                DFSUtil(g, i, visited);
                v = i;
            }
        }
        Arrays.fill(visited, false);
        DFSUtil(g, v, visited);
        for(int i=0;i<visited.length;i++){
            if(!visited[i])
                return -1;
        }
        return v;
    }
    
    public static void main(String[] args)
    {
        GraphNode g = new GraphNode(7);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(4, 1);
        g.addEdge(6, 4);
        g.addEdge(5, 6);
        g.addEdge(5, 2);
        g.addEdge(6, 0);
        MotherVertexInGraph m = new MotherVertexInGraph();
        System.out.println(m.findMother(g));
    }
    
}
