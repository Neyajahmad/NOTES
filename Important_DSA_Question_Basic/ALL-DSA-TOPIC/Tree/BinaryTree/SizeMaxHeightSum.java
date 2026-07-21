// 1.2

public class SizeMaxHeightSum {
    static int size=0;
    public static class Node{
        int val; //0
        Node left; // null 
        Node right; // null
        public Node(int val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }

    public static int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }

    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+sum(root.left)+sum(root.right);
    }

    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        // size++;
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root =new Node(1);
        // root.val=10;
        // System.out.println(root.val);

        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;

        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;

        Node e=new Node(6);
        b.right=e;

        // preorder(root);
        // System.out.println(size);

    //    System.out.println(size(root)); 
    // System.out.println(sum(root));
    System.out.println(height(root));

    }
    
}
