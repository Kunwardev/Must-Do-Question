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
public class SparseNumber
{
    //No Two or More Consecutive Bits are set or not
    private int function(int X){
        return (X&X>>1) > 0 ? 0 : 1;
    }
    
    public static void main(String[] args)
    {
        SparseNumber s = new SparseNumber();
        System.out.println(s.function(72));
    }
    
}
