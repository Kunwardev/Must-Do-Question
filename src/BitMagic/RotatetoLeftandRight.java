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
public class RotatetoLeftandRight
{
    private void function(int x, int y){
        System.out.println((x>>y)+" "+(x<<y));
    }
    
    public static void main(String[] args)
    {
        int x = 229, y = 3;
        RotatetoLeftandRight r = new RotatetoLeftandRight();
        r.function(x, y);
    }
    
}

