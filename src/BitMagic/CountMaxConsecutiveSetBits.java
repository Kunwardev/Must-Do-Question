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
public class CountMaxConsecutiveSetBits
{
    private int function(int X){
        int count = 0, max = 0;
        while(X != 0){
            if((X & 1) == 1)
                count++;
            else
                count = 0;
            if(count > max)
                max = count;
            X >>= 1;
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        CountMaxConsecutiveSetBits c = new CountMaxConsecutiveSetBits();
        int X = 222;
        System.out.println(c.function(X));
    }
    
}
