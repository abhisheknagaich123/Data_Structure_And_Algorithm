public class LinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void AddLast(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        Node lastnode=head;
        while (lastnode.next!=null){
            lastnode=lastnode.next;
        }
        lastnode.next=newnode;
    }
    public static void AddFirst(int data){
        Node newnode=new Node(data);
        if (head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void deletefirst(){
        if (head==null){
            System.out.println(" empty linkedList");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        head=head.next;
    }
    public static void deletelast(){
        if (head==null){
            System.out.println(" empty linkedList");
            return;
        }
        if (head.next==null){
            head=null;
            return;
        }
        Node lastnode=head.next;
        Node secoundlastNode=head;
        while (lastnode.next!=null){
            lastnode=lastnode.next;
            secoundlastNode=secoundlastNode.next;
        }
        secoundlastNode.next=null;
    }

    public static void print(){
        Node newnode=head;
        while (newnode!=null){
            System.out.print(newnode.data +" ---> ");
            newnode=newnode.next;
        }
        System.out.print("NUll");
    }
    public static void main(String[] args) {
        AddLast(1);
        AddLast(2);
        AddLast(3);
        AddLast(4);
//        print();
        AddFirst(5);
//        print();
        deletefirst();
        print();
    }
}
