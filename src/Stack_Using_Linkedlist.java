public class Stack_Using_Linkedlist {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;

        }
    }
    public static void push(int data){
        Node newnode= new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public static void pop(){

        if (head==null){
            System.out.println(" stack is Empty");
        }
        int result=0;
        result=head.data;
        System.out.println(result +" is pop");
        head=head.next;
    }
    public static void peek(){

        if (head==null){
            System.out.println(" stack is Empty");
        }
        int result=0;
        result=head.data;
        System.out.println(result +" top of stack");

    }
    public static void print(){
        Node newnode=head;
        while (newnode!=null){
            System.out.println(newnode.data +" -->");
            newnode=newnode.next;
        }
    }


    public static void main(String[] args) {
        push(5);
        push(6);
        push(8);
        push(4);
        push(1);
        push(10);
        push(11);
        pop();
        peek();
        print();
    }
}
