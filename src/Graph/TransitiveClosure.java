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
public class TransitiveClosure
{
    
    private void dfsUtil(GraphNode g, boolean[][] tc, int s, int v){
        tc[s][v] = true;
        Iterator<Integer> it = g.adj[v].listIterator();
        while(it.hasNext()){
            int n = it.next();
            if(!tc[s][n])
                dfsUtil(g, tc, s, n);
        }
    }
    
    private void transitiveClosure(GraphNode g){
        boolean[][] tc = new boolean[g.V][g.V];
        for(int i=0;i<g.V;i++)
            dfsUtil(g, tc, i, i);
        
        for(int i=0;i<g.V;i++){
            for(int j=0;j<g.V;j++){
                System.out.print(tc[i][j]?1+" ":0+" ");
            }System.out.println();
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
        TransitiveClosure t = new TransitiveClosure();
        t.transitiveClosure(g);
    }
    
}
