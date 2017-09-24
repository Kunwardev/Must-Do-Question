/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */

public class DetectCycleUndirectedGraph
{
    private int find(int[] parents, int v){
        if(parents[v] == -1)
            return v;
        return find(parents, parents[v]);
    }
    
    private void union(int[] parents, int x, int y){
        int parent_x = find(parents, x);
        int parent_y = find(parents, y);
        parents[parent_x] = parent_y;
    }
    
    private boolean isCycle(UndirectedGraph u){
        int[] parent = new int[u.V];
        Arrays.fill(parent, -1);
        for(int i=0;i<u.E;i++){
            int x = find(parent, u.edge[i].src);
            int y = find(parent, u.edge[i].dest);
            if(x == y)
                return true;
            union(parent, x, y);
        }
        return false;
    }
    
    public static void main(String[] args)
    {
        UndirectedGraph graph = new UndirectedGraph(3, 2);
        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
 
        // add edge 1-2
        graph.edge[1].src = 1;
        graph.edge[1].dest = 2;
 
        // add edge 0-2
        //graph.edge[2].src = 0;
        //graph.edge[2].dest = 2;
        DetectCycleUndirectedGraph d = new DetectCycleUndirectedGraph();
        System.out.println(d.isCycle(graph));
    }
    
}
