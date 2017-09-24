/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

import java.util.Arrays;

/**
 *
 * @author Kunwar
 */
public class WaterOverflow
{
    
    private float function(float K, int i, int j){
        if(j > i){
            System.out.println("INCORRECT OUTPUT");
            return -1;
        }
        float glass[] = new float[(i*(i+1))+1];
        Arrays.fill(glass, 0);
        int index  = 0;
        glass[index] = K;
        for(int row=1;row<=i && K != 0; row++){
            for(int col=1;col<=row;col++,index++){
                K = glass[index];
                glass[index] = (K >= 1f) ? 1f : K;
                K = (K >= 1f) ? K-1 : 0f;
                glass[index+row] += (K/2);
                glass[index+row+1] += (K/2);
            }
        }
        return glass[i*(i-1)/2 + j - 1];
    }
    
    public static void main(String[] args)
    {
        int i=2,j=1;
        float X = 3.0f;
        WaterOverflow w = new WaterOverflow();
        System.out.println(w.function(X, i, j));
    }
    
}
