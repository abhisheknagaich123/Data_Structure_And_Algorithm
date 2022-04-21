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
}
