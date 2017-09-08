/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arrays;

import java.util.ArrayList;

/**
 *
 * @author Kunwar
 */

class Interval{
    int buy, sell;
}

public class StockBuyAndSell
{
    private void buysell(int[] price, int n){
        if(n == 1)
            return;
        int count = 0;
        ArrayList<Interval> al = new ArrayList<>();
        int i=0;
        while(i < n-1){
            while((i < n-1) && (price[i+1] <= price[i]))
                i++;
            if(i == n-1)
                break;
            Interval j = new Interval();
            j.buy = i++;
            while((i < n) && price[i] >= price[i-1])
                i++;
            j.sell = i-1;
            al.add(j);
        }
        for(int j=0;j<al.size();j++){
        	System.out.println(al.get(j).buy+"  "+al.get(j).sell);
        }
    }
    
    public static void main(String[] args)
    {
        StockBuyAndSell s = new StockBuyAndSell();
        int[] price = new int[]{100, 180, 260, 310, 40, 535, 695};
        s.buysell(price, 7);
    }
    
}
