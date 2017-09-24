/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy;

/**
 *
 * @author Kunwar
 */
public class LargestNdigitPossible
{
    
    private int function(int N, int sum){
        int number = 0;
        while(N != 0){
            if(sum > 9){
                number = (number*10)+9;
                sum = sum-9;
            }else{
                number = (number*10)+sum;
                sum = 0;
            }
            N--;
        }
        return number;
    }
    
    public static void main(String[] args)
    {
        LargestNdigitPossible l = new LargestNdigitPossible();
        System.out.println(l.function(3, 20));
    }
    
}
