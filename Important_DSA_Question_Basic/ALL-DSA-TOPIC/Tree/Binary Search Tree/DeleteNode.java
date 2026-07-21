import java.util.*;

public class DeleteNode {
    public static class Node {
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node deleteNode(Node root, int target) {
        Node temp = new Node(Integer.MAX_VALUE);
        temp.left = root;
        delete(temp, target);
        return temp.left;
    }

    private static void delete(Node root, int target) {
        if (root == null) return;
        if (root.val > target) { // go left
            if (root.left == null) return;
            if (root.left.val == target) {
                Node l = root.left; // Node to delete
                if (l.left == null && l.right == null) root.left = null; // 0 children
                else { // 1 or 2 children handled using predecessor
                    Node curr = l;
                    Node pred = curr.left;
                    if (pred == null) { // If left child is null, promote right child
                        root.left = l.right;
                    } else {
                        while (pred.right != null) pred = pred.right;
                        delete(root, pred.val);
                        pred.left = curr.left;
                        pred.right = curr.right;
                        root.left = pred;
                    }
                }
            } else delete(root.left, target);
        } else { // go right
            if (root.right == null) return;
            if (root.right.val == target) {
                Node r = root.right; // Node to delete
                if (r.left == null && r.right == null) root.right = null; // 0 children
                else { // 1 or 2 children handled using predecessor
                    Node curr = r;
                    Node pred = curr.left;
                    if (pred == null) { // If left child is null, promote right child
                        root.right = r.right;
                    } else {
                        while (pred.right != null) pred = pred.right;
                        delete(root, pred.val);
                        pred.left = curr.left;
                        pred.right = curr.right;
                        root.right = pred;
                    }
                }
            } else delete(root.right, target);
        }
    }

    public static Node constructbfs(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int n = arr.length;
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < n - 1) {
            Node temp = q.remove();
            Node left = new Node(10);
            Node right = new Node(100);
            if (arr[i].equals("")) left = null;
            else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i + 1].equals("")) right = null;
            else {
                int r = Integer.parseInt(arr[i + 1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        String[] arr = {"50", "20", "60", "17", "34", "55", "89", "10", "", "28", "", "", "", "70", "", "", "14"};
        Node root = constructbfs(arr);
        preorder(root);
        System.out.println();
        root = deleteNode(root, 50);
        preorder(root);
    }




       // left node deletion method leaf node

    // private static void delete(Node root,int target){
    //    if(root==null) return;
    //    if(root.val>target){ // go left
    //     if(root.left==null) return;
    //     if(root.left.val==target) root.left=null;
    //     else delete(root.left, target);
    //    }
    //    else{ // go right
    //     if(root.right==null) return;
    //     if(root.right.val==target) root.right=null;
    //     else delete(root.right, target);
    //    }
    // }



 // left node deletion method one child
    //   private static void delete(Node root,int target){
    //    if(root==null) return;
    //    if(root.val>target){ // go left
    //     if(root.left==null) return;
    //     if(root.left.val==target){
    //         Node l=root.left; //l is that node that i wish to delete
    //         if(l.left==null && l.right==null) root.left=null; // 0 children
    //         else if(l.left==null || l.right==null){ //1 child
    //             if(l.left!=null) root.left=l.left;
    //             else root.left=l.right;
    //         }
    //     }
    //     else delete(root.left, target);
    //    }

    //    else{ // go right
    //     if(root.right==null) return;
    //     if(root.right.val==target) {
    //         Node r=root.right; // r is that node we will delete
    //         if(r.left==null && r.right==null) root.right=null;
    //         else if(r.left==null || r.right==null){ // 1 child
    //             if(r.left!=null) root.right=r.left;
    //             else root.right=r.right;
    //         }
    //     }
    //     else delete(root.right, target);
    //    }
    // }
}
