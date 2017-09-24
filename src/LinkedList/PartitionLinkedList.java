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
public class PartitionLinkedList
{
    private Node function(Node head, int x){
        Node first = new Node(0);
        Node d_first = first;
        Node second = new Node(0);
        Node d_second = second;
        Node result = first;
        while(head != null){
            if(head.data < x){
                first.next = new Node(head.data);
                first = first.next;
            }else if(head.data > x){
                second.next = new Node(head.data);
                second = second.next;
            }
            head = head.next;
        }
        first.next = new Node(x);
        first = first.next;
        first.next = d_second.next;
        //System.out.print();
        return d_first.next;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(3);
        head.next = new Node(5);
        head.next.next = new Node(8);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(10);
        head.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next = new Node(1);
        PartitionLinkedList p = new PartitionLinkedList();
        head = p.function(head, 5);
        while(head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }
    
}
