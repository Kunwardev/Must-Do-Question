/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.LinkedList;

/**
 *
 * @author Kunwar
 */
public class GraphNode
{
    int V;
    LinkedList<Integer> adj[];
    
    public GraphNode(int x){
        this.V = x;
        adj = new LinkedList[this.V];
        for(int i=0;i<this.V;i++){
            adj[i] = new LinkedList<>();
        }        
    }
    
    public void addEdge(int v, int w){
        adj[v].add(w);
    }
     
}
