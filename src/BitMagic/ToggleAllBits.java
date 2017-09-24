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
public class ToggleAllBits
{
    // Time Complexity = O(N)
    private int otherFunction(int a){
        int temp = 1;
        while(temp <= a){
            a = a ^ temp;
            temp = temp << 1;
        }
        return a;
    }
    
    // Time Complexity = O(1)
    private int functionUtil(int a){
        a |= (a>>1);
        a |= (a>>2);
        a |= (a>>4);
        a |= (a>>8);
        a |= (a>>16);
        return a;
    }
    
    private int function(int a){
        return (a ^ functionUtil(a));
    }
    
    public static void main(String[] args)
    {
        ToggleAllBits t = new ToggleAllBits();
        int x = 10;
        //System.out.println(t.otherFunction(x));
        System.out.println(t.function(x));
    }
    
}
