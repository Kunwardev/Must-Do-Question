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
public class CountNoInRange
{
    private int countDigit(int number, int n, int d){
        int powerOf10 = (int) Math.pow(10, d);
        int nextPowerOf10 = powerOf10 * 10;
        int right = number % powerOf10;
        System.out.println(powerOf10+" "+nextPowerOf10+" "+right);
        int roundDown = number - number % nextPowerOf10;
        int roundUp = roundDown + nextPowerOf10;
        System.out.println(roundDown+" "+roundUp);
        int digit = (number / powerOf10) % 10;
        System.out.println(digit+" ---- ");
        if(digit < d)
            return roundDown / 10;
        if(digit == d)
            return roundDown / 10 + right + 1;
        return roundUp / 10;
    }
    
    private int numbersInRange(int number, int n){
        String numbers = number+"";
        int length = numbers.length();
        int count = 0;
        for(int digit = 0; digit < length; digit++){
            count += countDigit(number, n, digit);
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        CountNoInRange c = new CountNoInRange();
        int number = 22;
        System.out.println(c.numbersInRange(number, 2));
    }
    
}
