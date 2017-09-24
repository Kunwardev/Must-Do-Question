/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BitMagic;

/**
 *
 * @author Kunwar
 */
public class NextHigherNumberWithSameSetBits
{
    private int check(int x){
        int rightOne, nextHigherOneBit, rightOnesPattern;
        int next = 0;
        System.out.println(Integer.toBinaryString(x));
        rightOne = (x & -x);
        System.out.println(Integer.toBinaryString(rightOne));
        nextHigherOneBit = x + rightOne;
        System.out.println(Integer.toBinaryString(nextHigherOneBit));
        rightOnesPattern = x ^ nextHigherOneBit;
        System.out.println(Integer.toBinaryString(rightOnesPattern));
        rightOnesPattern = (rightOnesPattern) / rightOne;
        System.out.println(Integer.toBinaryString(rightOnesPattern));
        rightOnesPattern >>= 2;
        System.out.println(Integer.toBinaryString(rightOnesPattern));
        next = nextHigherOneBit | rightOnesPattern;
        System.out.println(Integer.toBinaryString(next));
        return next;
    }
    
    public static void main(String[] args)
    {
        int x = 156;
        NextHigherNumberWithSameSetBits n = new NextHigherNumberWithSameSetBits();
        System.out.println(n.check(x));
    }
    
}
