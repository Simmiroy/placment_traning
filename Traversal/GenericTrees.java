package Traversal;


public class GenericTrees<X> {
    private final X data;
    private GenericTrees<X> left;
    private GenericTrees<X> right;
    public GenericTrees(X data){
        this.data=data;
        this.left=this.right=null;
    }
    void preOrder(){
        System.out.println(this.data+" ");
        if(this.left!=null) this.left.preOrder();

        if(this.right!=null) this.right.preOrder();

    }
    void inOrder(){
        if(this.left!=null) this.left.inOrder();
        System.out.println(this.data+" ");
        if(this.right!=null) this.right.inOrder();
    }
    void postOrder(){
        if(this.left!=null) this.left.postOrder();
        if(this.right!=null) this.right.postOrder();
        System.out.println(this.data+" ");
    }

    public static void main(String[] args) {
        //This is a tree of integers.
        GenericTrees<Integer> integerRoot= new GenericTrees<>(1);
        integerRoot.left=new GenericTrees<>(2);
        integerRoot.left=new GenericTrees<>(3);
        System.out.println("PreOrder:");
        integerRoot.preOrder();
        System.out.println();
        System.out.println("InOrder:");
        integerRoot.inOrder();
        System.out.println();
        System.out.println("PostOrder:");
        integerRoot.postOrder();
        System.out.println();

        //This is a tree of floats.

        GenericTrees<Float> floatRoot= new GenericTrees<>(1.5f);
        floatRoot.left=new GenericTrees<>(2.3f);
        floatRoot.left=new GenericTrees<>(3.4f);
        System.out.println("PreOrder:");
        floatRoot.preOrder();
        System.out.println();
        System.out.println("InOrder:");
        floatRoot.inOrder();
        System.out.println();
        System.out.println("PostOrder:");
        floatRoot.postOrder();
        System.out.println();
        //This is a tree of booleans.
        GenericTrees<Boolean> booleanRoot= new GenericTrees<>(true);
        System.out.println("PreOrder:");
        booleanRoot.preOrder();
        System.out.println();
        System.out.println("InOrder:");
        booleanRoot.inOrder();
        System.out.println();
        System.out.println("PostOrder:");
        booleanRoot.postOrder();
        System.out.println();


    }
}

