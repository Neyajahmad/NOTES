import java.util.*;

public class First {
    private static class Node {
        int value;
        List<Node> child;

        Node(int value) {
            this.value = value;
            child = new ArrayList<>();
        }
    }

    private static void formTree(Node root) {
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));

        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));

        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));

        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }

// Preorder Traversal
    public static void Preorder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.value+" ");
            return;
        }
        System.out.print(root.value+" ");
        int n=root.child.size();
        for(int i=0;i<n;i++){
            Preorder(root.child.get(i));
        }
    }

    // PostOrder Traversal

    public static void PostOrder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.value+" ");
            return;
        }
        int n=root.child.size();
        for(int i=0;i<n;i++){
            PostOrder(root.child.get(i));
        }
        System.out.print(root.value+" ");
    }

    // LevelOrder Traversal..
    static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
        Node currentNode=q.peek();
        System.out.print(currentNode.value+" ");
        q.remove();
        int noOfChildren=currentNode.child.size();
        for(int i=0;i<noOfChildren;i++){
            q.add(currentNode.child.get(i));
        }
    }
    }


    static void ZigZagOrderTraversal(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Node> currentLevel=new ArrayList<>();
            while(levelsize-- >0){
        Node currentNode=q.peek();
        currentLevel.add(currentNode);
        q.remove();
        int noOfChildren=currentNode.child.size();
        for(int i=0;i<noOfChildren;i++){
            q.add(currentNode.child.get(i));
        }
    }
    if(flag==false){
        printNodeList(currentLevel);
    }
    else{
        reverse(currentLevel);
        printNodeList(currentLevel);
    }
    flag=!flag;
    }
}

static void printNodeList(List<Node> nodeList){
    for(int i=0;i<nodeList.size();i++){
        System.out.print(nodeList.get(i).value+" ");
    }
    System.out.println();
}

static void reverse(List<Node> nodeList) {
    int left = 0;
    int right = nodeList.size() - 1;
    while (left < right) {
        Node temp = nodeList.get(left);
        nodeList.set(left, nodeList.get(right));
        nodeList.set(right, temp);
        left++;
        right--;
    }
}
 


    public static void main(String[] args) {
        Node root = new Node(30);
        formTree(root);
        Preorder(root);
        System.out.println();
        System.out.println();
        PostOrder(root);

        System.out.println();
        System.out.println();

        levelOrder(root);

        System.out.println();
        System.out.println();

        ZigZagOrderTraversal(root);
    }
}
