package Traversal;
public class TreeNode {
    int data;  //data of the node
    tNode left;  //The reference to the left child
    tNode right;  //The reference to the right side
    TreeNode(int data){
        this.data=data;
        this.left=this.right=null;  //Initially the node has no children
    }
    public static void preOrder(tNode root) {  //DLR
        if(root!=null) {
            System.out.print(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(tNode root) {   //LDR
        if(root!=null) {
            inOrder(root.left);
            System.out.print(root.data +" ");
            inOrder(root.right);
        }
    }
    public static void postOrder(tNode root) {  //LRD
        if(root!=null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data +" ");
        }
    }
    public static void main(String[] args) {
        //Rule for constructing Binary Tree => Top to bottom and left to right
        //Level after level
        //Level 0
        tNode root=new tNode(1);
        //Level 1
        root.left=new tNode(2);
        root.right=new tNode(3);
        //Level 2
        root.left.left=new tNode(4);
        root.left.right=new tNode(5);
        root.right.left=new tNode(6);
        root.right.right=new tNode(7);
        //Level 3
        root.left.right.left=new tNode(9);
        root.right.right.left=new tNode(15);
        System.out.println("PreOrder Traversal:");
        preOrder(root);
        System.out.println();
        System.out.println("InOrder Traversal:");
        inOrder(root);
        System.out.println();
        System.out.println("PostOrder Traversal:");
        postOrder(root);
        System.out.println();
    }

}
