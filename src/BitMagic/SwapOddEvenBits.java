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
public class SwapOddEvenBits
{
    private int function(int x){
        int E = x & (0xAAAAAAAA);
        System.out.println(E);
        int O = x & (0x55555555);
        System.out.println(O);
        E >>= 1;
        System.out.println(E);
        O <<= 1;
        System.out.println(O);
        return (E | O);
    }
    
    public static void main(String[] args)
    {
        SwapOddEvenBits s = new SwapOddEvenBits();
        int x = 23;
        System.out.println(s.function(x));
    }
    
}
