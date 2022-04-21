import java.util.Scanner;

public class Binary_Search_Tree {
   static class Node{
    Node left , right;
    int data;
    Node(int data){
        this.data=data;
    }

}
    static Node createTree(){
        Node root=null;
        System.out.println(" Enter data : ");
        int data=sc.nextInt();
        if (data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println(" Enter data for left : " +data);
        root.left=createTree();
        System.out.println(" Enter data for right : "+data);
        root.right=createTree();
        return root;
    }
    static Scanner sc =new Scanner(System.in);;
    public static void main(String[] args) {

        createTree();
//        inOrder(root);
//        System.out.println( );
//        preOrder(root);
//        System.out.println( );
//        postOrder(root);
        //    heightofbinary(root);


    }
}
