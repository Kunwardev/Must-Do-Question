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
public class TransitiveClosureFloydWarshall
{
    private void transitiveClosure(int[][] graph){
        int[][] reach = new int[graph.length][graph[0].length];
        int i,j,k;
        for(i=0;i<reach.length;i++){
            for(j=0;j<reach.length;j++){
                reach[i][j] = graph[i][j];
            }
        }
        
        for(k=0;k<graph.length;k++){
            for(i=0;i<graph.length;i++){
                for(j=0;j<graph.length;j++){
                    reach[i][j] = ((reach[i][j] != 0) || 
                            (reach[i][k] != 0 && reach[k][j] != 0)?1:0);
                }
            }
        }
        printSolution(reach);
    }
    
    private void printSolution(int[][] reach){
        for(int i=0;i<reach.length;i++){
            for(int j=0;j<reach.length;j++){
                System.out.print(reach[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        int graph[][] = new int[][]{ {1, 1, 0, 1},
                                      {0, 1, 1, 0},
                                      {0, 0, 1, 1},
                                      {0, 0, 0, 1}
                                    };
        TransitiveClosureFloydWarshall t = new TransitiveClosureFloydWarshall();
        t.transitiveClosure(graph);
    }
    
}
