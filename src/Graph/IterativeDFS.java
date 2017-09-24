/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class IterativeDFS
{
    private void DFS(GraphNode g, int s){
        ArrayList<Boolean> al = new ArrayList<>();
        for(int i=0;i<g.V;i++)
            al.add(Boolean.FALSE);
        Stack<Integer> st = new Stack<>();
        st.push(s);
        while(!st.isEmpty()){
            s = st.pop();
            if(!al.get(s)){
                System.out.print(s+" ");
                al.set(s, Boolean.TRUE);
            }
            Iterator<Integer> it = g.adj[s].listIterator();
            while(it.hasNext()){
                int v = it.next();
                if(!al.get(v))
                    st.push(v);
            }
        }
    }
    
    public static void main(String[] args)
    {
        GraphNode g = new GraphNode(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(2, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 4);
        IterativeDFS i = new IterativeDFS();
        i.DFS(g, 0);
    }
    
}
