/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Not Working

package LinkedList;

/**
 *
 * @author Kunwar
 */
public class Rotate_LinkedListBlockWise
{
    private Node rotateHelper(Node blockHead, Node blockTail, int d, Node tail, int k){
        if(d == 0)
            return blockHead;
        else if(d > 0){
            Node temp = blockHead;
            for(int i=1; i<k-1 && temp.next.next != null;i++){
                temp= temp.next;
            }
            blockTail.next = blockHead;
            tail = temp;
            return rotateHelper(blockTail, temp, d-1, tail, k);
        }
        else{
            blockTail.next = blockHead;
            tail = blockHead;
            return rotateHelper(blockHead.next, blockHead, d+1, tail, k);
        }
    }
    
    private Node rotateByBlocks(Node head, int k, int d){
        if(head==null || head.next==null)
            return head;
        if(d == 0)
            return head;
        Node temp = head, tail = null;
        int i;
        for(i=1;i<k&&temp.next!=null;i++)
            temp = temp.next;
        Node nextBlock = temp.next;
        if(i < k)
            head = rotateHelper(head, temp, d%k, tail, i);
        else
            head = rotateHelper(head, temp, d%k, tail, k);
        tail.next = rotateByBlocks(nextBlock, k, d%k);
        return head;
    }
    
    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next.next.next = new Node(9);
        int k = 3, d =2;
        Rotate_LinkedListBlockWise r = new Rotate_LinkedListBlockWise();
        head = r.rotateByBlocks(head, k, d);
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    
}
