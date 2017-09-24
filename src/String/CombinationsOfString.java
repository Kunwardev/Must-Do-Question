/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package String;

/**
 *
 * @author Kunwar
 */
public class CombinationsOfString
{
    StringBuilder sb = new StringBuilder();
    private void combine(String str, int start){
        for(int i=start;i<str.length();i++){
            sb.append(str.charAt(i));
            System.out.println(sb.toString());
            if(i < str.length())
                combine(str, i+1);
            sb.setLength(sb.length()-1);
            System.out.println(sb);
        }
    }
    
    public static void main(String[] args)
    {
        String str = "wxyz";
        CombinationsOfString c = new CombinationsOfString();
        c.combine(str, 0);
    }
    
}
