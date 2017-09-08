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
public class LeadersInArray
{
    private void function(int[] arr){
        int max_till = arr[arr.length-1];
        System.out.print(max_till+" ");
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] > max_till){
                System.out.print(arr[i]+" ");
                max_till = arr[i];
            }
        }
    }
    
    public static void main(String[] args)
    {
        LeadersInArray l = new LeadersInArray();
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        l.function(arr);
    }
    
}
