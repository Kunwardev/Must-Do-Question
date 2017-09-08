/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

/**
 *
 * @author Kunwar
 */
public class FindMissingNumeber
{
    private int find(int[] arr){
        int xor = 0;
        for(int i: arr)
            xor ^= i;
        for(int i=1;i<= arr.length+1;i++)
            xor ^= i;
        return xor;
    }
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args)
    {
        FindMissingNumeber f = new FindMissingNumeber();
        int[] arr = new int[]{1,2,4,5};
        System.out.println(f.find(arr));
    }
}
