/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/**
 *
 * @author Kunwar
 */
public class FindNumberOfZeroesToFlip
{
    private void findZeroes(int[] arr,int m){
        int wL=0,wR=0,bestL=0,bestWindow=0,zeroCount=0;
        while(wR < arr.length){
            if(zeroCount <= m){
                if(arr[wR] == 0)
                    zeroCount++;
                wR++;
            }
            if(zeroCount > m){
                if(arr[wL] == 0)
                    zeroCount--;
                wL++;
            }
            if(wR-wL > bestWindow){
                bestWindow = wR-wL;
                bestL = wL;
            }
        }
        for(int i=0;i<bestWindow;i++){
            if(arr[bestL+i] == 0)
                System.out.print((bestL+i)+" ");
        }
    }
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{1, 0, 0, 1, 1, 0, 1, 0, 1, 1};
        FindNumberOfZeroesToFlip f = new FindNumberOfZeroesToFlip();
        f.findZeroes(arr, 2);
    }
    
}
