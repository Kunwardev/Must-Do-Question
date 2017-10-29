/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Kunwar
 */
public class PairWiseSwapping
{
    private Node pairwiseSwap(Node head){
        Node temp = head;
        while(temp != null && temp.next != null){
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
        return head;
    }
    
    public static void main(String[] args)
    {
        PairWiseSwapping p = new PairWiseSwapping();
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head = p.pairwiseSwap(head);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
