/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author Kunwar
 */
public class JosephusProblem
{
    private int function(int n, int k){
        if(n == 1){
            return 1;
        }
        int p = (function(n-1, k)+k-1)%n+1;
        System.out.println(p);
        return p;
    }
    
    public static void main(String[] args)
    {
        JosephusProblem j = new JosephusProblem();
        System.out.println(j.function(5, 2));
    }
    
}
