/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kunwar
 */
public class PermutationsWithoutDuplicates
{
    private void permute(char[] input){
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char p: input){
            if(hm.containsKey(p)){
                hm.put(p, hm.get(p)+1);
            }else
                hm.put(p, 1);
        }
        char[] str = new char[hm.size()];
        int[] count= new int[hm.size()];
        int index = 0;
        for(Map.Entry<Character, Integer> entry: hm.entrySet()){
            str[index] = entry.getKey();
            count[index++] = entry.getValue();
        }
        char[] result = new char[input.length];
        int level = 0;
        permuteUtil(str, count, result, level);
    }

    private void permuteUtil(char[] str, int[] count, char[] result, int level)
    {
        if(level == result.length){
            for(char p: result)
                System.out.print(p);
            System.out.println();
            return;
            
        }
        for(int i=0;i<str.length;i++){
            if(count[i] == 0)
                continue;
            result[level] = str[i];
            count[i]--;
            permuteUtil(str, count, result, level+1);
            count[i]++;
        }
    }
    
    public static void main(String[] args)
    {
        char[] a = "ABCA".toCharArray();
        PermutationsWithoutDuplicates p = new PermutationsWithoutDuplicates();
        p.permute(a);
    }
    
}
