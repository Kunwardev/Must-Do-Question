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
public class AloneInCouple
{
    private int function(int[] arr){
        int X = 0;
        for(int j: arr){
            X ^= j;
        }
        return X;
    }
    
    public static void main(String[] args)
    {
        AloneInCouple a = new AloneInCouple();
        int[] arr = new int[]{1,2,3,2,1};
        System.out.println(a.function(arr));
    }
    
}
