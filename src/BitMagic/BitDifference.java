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
public class BitDifference
{
    // Number of Bits needed to convert from A to B
    private int function(int A, int B){
        int x = A ^ B;
        int count = 0;
        while(x != 0){
            if((x & 1) == 1)
                count++;
            x >>= 1;
        }
        return count;
    }
    
    public static void main(String[] args)
    {
        BitDifference b = new BitDifference();
        System.out.println(b.function(10, 20));
    }
    
}
