import java.util.Scanner;

public class Binary_Search_Tree {
   static class Node{
    Node left , right;
    int data;
    Node(int data){
        this.data=data;
    }

}
    static Node insert(Node root,int key){

         if (root == null) {
             root = new Node(key);
             return root;
         }
        if (key< root.data){
//            System.out.println(" Enter data for left : " +data);
            root.left=insert(root.left,key);
        }
        else if (key> root.data){
//            System.out.println(" Enter data for right : " +data);
            root.right=insert(root.right,key);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root=null;
        root=insert(root,50);
        insert(root,60);
        insert(root,30);
        insert(root,70);
        insert(root,30);
        insert(root,100);
        insert(root,05);
        insert(root,56);
    }
}
