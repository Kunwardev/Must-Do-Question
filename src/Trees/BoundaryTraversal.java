/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trees;

/**
 *
 * @author Kunwar
 */
public class BoundaryTraversal
{
    private void printLeaves(TreeNode root){
        if(root != null){
            printLeaves(root.left);
            if(root.left == null && root.right == null)
                System.out.print(root.data+" ");
            printLeaves(root.right);
        }
    }
    
    private void printBoundaryLeft(TreeNode root){
        if(root != null){
            if(root.left != null){
                System.out.print(root.data+" ");
                printBoundaryLeft(root.left);
            }
            else if(root.right != null){
                System.out.print(root.data+" ");
                printBoundaryLeft(root.right);
            }
        }
    }
    
    private void printBoundaryRight(TreeNode root){
        if(root != null){
            if(root.right != null){
                printBoundaryRight(root.right);
                System.out.print(root.data+" ");
            }
            else if(root.left != null){
                printBoundaryRight(root.left);
                System.out.print(root.data+" ");
            }
        }
    }
    
    private void printBoundary(TreeNode root){
        if(root!=null){
            System.out.print(root.data+" ");
            printBoundaryLeft(root.left);
            printLeaves(root.left);
            printLeaves(root.right);
            printBoundaryRight(root.right);
        }
    }
    
    public static void main(String[] args)
    {
        BoundaryTraversal b = new BoundaryTraversal();
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(12);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);
        root.right.right = new TreeNode(25);
        b.printBoundary(root);
        
    }
    
}
