/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Graph;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author Kunwar
 */
public class VectorCLoneCheck
{
    
    private void function(){
        Vector<Integer> v = new Vector<>();
        v.add(2);
        v.add(3);
        v.add(1);
        Vector<Integer> x = v;
        Vector<Integer> w = (Vector<Integer>) v.clone();
        v.add(4);
        Iterator<Integer> it = v.listIterator();
        Iterator<Integer> it1 = w.listIterator();
        Iterator<Integer> it2 = x.listIterator();
        System.out.println(v.hashCode()+" "+w.hashCode()+" "+x.hashCode());
        System.out.println(v.toString());
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        while(it1.hasNext()){
            System.out.print(it1.next()+" ");
        }
        System.out.println();
        while(it2.hasNext()){
            System.out.print(it2.next()+" ");
        }
    }
    
    
    public static void main(String[] args)
    {
        VectorCLoneCheck b = new VectorCLoneCheck();
        b.function();
    }
    
}
