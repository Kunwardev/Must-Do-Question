/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Greedy;

/**
 *
 * @author Kunwar
 */
public class MinNumberOfCoins
{
    private void function(int m){
        int[] change = new int[]{1,2,5,10,20,50,100,500,1000};
        functionUtil(m, change);
    }

    private void functionUtil(int m, int[] change)
    {
        int n = change.length;
        while(m != 0 && n != 0){
            if(m / change[n-1] != 0){
                System.out.println("Number of "+change[n-1]+" coins: "+(m / change[n-1]));
                m = m % change[n-1];
                n--;
            }else{
                n--;
            }
        }
    }
    
    public static void main(String[] args)
    {
        MinNumberOfCoins m = new MinNumberOfCoins();
        int x = 43;
        m.function(x);
    }
    
}
