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
public class SmallestNumberDivisibleByNWithKZeroes
{
    private int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
    
    private int function(int n, int k){
        int nu = (int)Math.pow(10,k);
        int lcm = (nu * n)/(gcd(nu, n));
        return lcm;
    }
    
    public static void main(String[] args)
    {
        int n = 375, k = 4;
        SmallestNumberDivisibleByNWithKZeroes s = new SmallestNumberDivisibleByNWithKZeroes();
        System.out.println(s.function(n, k));
    }
    
}
