package Traversal;
class tNode {
        int data;
        tNode left,right;
        tNode(int value){
            data=value;
            left=right=null;
        }
    }
public class BinarySearchTree {
    public static void inOrder(tNode root){
        if(root !=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
    }
    static tNode insert(tNode root, int key){
        //case1: Empty tree ----> the new node becomes the root
        if(root==null){
            return new tNode(key);
        }
        if(key< root.data){
            root.left=insert(root.left,key);
        }else if(key> root.data){
            root.right=insert(root.right,key);
        }
        return root;
    }
    static tNode search(tNode root, int key){
        //1. Empty tree--> return null(root)
        //2. The root node data matches with the key --> return root
        if(root==null || root.data==key){
            return root;
        }
        if(root.data<key){
            return search(root.right,key);
        }
        return search(root.left,key);
    }
    static tNode findMin(tNode root){
        tNode curr = root;
        while(curr!=null  && curr.left!=null){
            curr=curr.left;
        }
        return curr;
    }
//    public  static tNode deleteNode(tNode root, int key){
//        if(root==null ) {
//            return root;
//        } if(root.data>key){
//            return deleteNode(root.right,key);
//        }else if(key> root.data){
//            return deleteNode(root.left,key);
//    }else{
//            //Only one child--> return the non null child
//            if(root.left==null){
//                tNode temp = root.right;
//                root =null;
//                return  temp;
//            }else if(root.right == null){
//                tNode temp = root.left;
//                root =null;
//                return  temp;
//            }
//            //when node has both the children
//            //Find the inorder successor
//            //It is the least value in the right subtree
//            tNode temp= findMin(root.right);
//            //replace the data with the inorder subtree
//            root.data=temp.data;
//            //While doing this we will end up with the duplicates
//            //delete the duplicate that exists in the right subtree
//            root.right=deleteNode(root.right,temp.data);
//        }
//        return root;
//    }
public static tNode deleteNode(tNode root, int key){
    if(root == null){
        return root;
    }

    if(key < root.data){
        root.left = deleteNode(root.left, key);
    }
    else if(key > root.data){
        root.right = deleteNode(root.right, key);
    }
    else{
        // case 1: one child or no child
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }

        // case 2: two children
        tNode temp = findMin(root.right);
        root.data = temp.data;
        root.right = deleteNode(root.right, temp.data);
    }

    return root;
}

    public static void main(String[] args) {
        tNode root =null;
        root=insert(root,50);
        inOrder(root);
        System.out.println();
        int[] arr ={60,20,30,10,58,100};
        for (int i=0; i<arr.length; i++){
            root=insert(root,arr[i]);
        }
        inOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        tNode result=search(root,1001);
        if(result==null){
            System.out.println("Key not found.");
        }else{
            System.out.println("Key found.");
        }
        root=deleteNode(root,50);
        inOrder(root);
        System.out.println();
        System.out.println(root.data);
        }

}
