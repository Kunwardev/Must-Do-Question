/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BitMagic;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Kunwar
 */
public class FindTheSparseNumber
{
    private int function(int X){
        ArrayList<Integer> st = new ArrayList<>();
        while(X != 0){
            st.add(X&1);
            X>>=1;
        }st.add(0);
        int last_final = 0;
        for(int i=1;i<st.size()-1;i++){
            if(st.get(i)==1 && st.get(i-1)==1 &&st.get(i+1) != 1){
                st.set(i+1, 1);
            for(int j=i;j>=last_final;j--){
                st.set(j,0);
            }
            last_final = i+1;
            }
        }
        int ans = 0;
        for(int i=0;i<st.size();i++){
            ans += st.get(i)*(1<<i);
        }
        return ans;
    }
    
    public static void main(String[] args)
    {
        FindTheSparseNumber f = new FindTheSparseNumber();
        System.out.println(f.function(38));
    }
    
}
