/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

/**
 *
 * @author Kunwar
 */
public class UndirectedGraph
{
    int V, E;
    Edge[] edge;
    
    class Edge{
        int src, dest;
    };
    
    public UndirectedGraph(int V, int E){
        this.V = V;
        this.E = E;
        this.edge = new Edge[E];
        for(int i=0;i<E;i++)
            this.edge[i] = new Edge();
    }
    
}
