// 57.14 

import java.util.LinkedList;
import java.util.Queue;
public class Traversals{
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

    
  public static Node constructbfs(String[] arr){
    int x= Integer.parseInt(arr[0]);
    int n= arr.length;
    Node root =new Node(x);
    Queue<Node> q =new LinkedList<>();
    q.add(root);
    int i=1;
    while(i<n-1){
        Node temp=q.remove();
        Node left=new Node(10);
        Node right=new Node(100);
        if(arr[i].equals("")) left =null;
        else{
            int l=Integer.parseInt(arr[i]);
            left.val=l;
            q.add(left);
        }
        if(arr[i+1].equals("")) right =null;
        else{
            int r=Integer.parseInt(arr[i+1]);
            right.val=r;
            q.add(right);
        }
        temp.left=left;
        temp.right=right;
        i+=2;
    }
    return root;
  }
    public static void main(String[] args) {
        String[] arr={"10","5","15","2","8","12","17"};
        Node root =constructbfs(arr);
        preorder(root);
        
    }  

    public static void preorder(Node root){
        // preorder is root left right
        if(root==null) return ;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }

}