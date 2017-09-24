/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Recursion;

/**
 *
 * @author Kunwar
 */
public class SpecialKeyBoardhaving4Keys
{
    private int function(int n){
        if(n <= 6)
            return n;
        int max = 0;
        for(int i=n-3;i>=1;i--){
            int curr = (n-i-1) * function(i);
            if(curr > max)
                max = curr;
        }
        return max;
    }
    
    public static void main(String[] args)
    {
        // Better to be done in Dynamic Programming
        // For any keystroke N, we need to loop from N-3 keystrokes
        // back to 1 keystroke to find a breakpoint 'b' after which we
        // will have Ctrl-A, Ctrl-C and then only Ctrl-V all the way.
        SpecialKeyBoardhaving4Keys s = new SpecialKeyBoardhaving4Keys();
        int n = 14;
        System.out.println(s.function(n));
    }

}
