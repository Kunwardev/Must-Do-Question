/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Algorithms;

/**
 *
 * @author Kunwar
 */
public class NumberOfJumpsForThiefToCrossWall
{
    private int function(int Xjump,int Yjump, int height){
        if(Xjump >= height)
            return 1;
        float jump = Xjump - Yjump;
        return (int)(Math.ceil(height/jump));
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{11, 10, 10, 9};
        int Xjump = 10;
        int Yjump = 1;
        NumberOfJumpsForThiefToCrossWall n = new NumberOfJumpsForThiefToCrossWall();
        int total = 0;
        for(int i: arr){
            total += n.function(Xjump, Yjump, i);
        }
        System.out.println(total);
    }
    
}
