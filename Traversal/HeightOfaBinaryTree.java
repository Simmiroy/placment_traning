package Traversal;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class HeightOfaBinaryTree {
    static int findheight(Node root){
        //Base case: If the root is null, tree is empty,height is 0
        if(root==null){
            return 0;
        }
        int leftheight=findheight(root.left);
        int righttheight=findheight(root.right);
        return  Math.max(leftheight,righttheight)+1;
    }

    public static void main(String[] args) {
        Node root= new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.right.right=new Node(4);
        System.out.println("Height of the 1st tree: " +findheight(root));
        Node root1= null;
        System.out.println("Height of the 2nd tree: "+findheight(root1));
    }
}
