public class queue_Using_Linkedlist {
    Node head=null;
    Node tail=null;
   class Node {
       int data;
       Node next;

       Node(int data) {
           this.data = data;

       }
   }
   public void Add(int data){
       Node newnode=new Node(data);
       if (head==null){
           head=tail=newnode;
           return;
       }
       tail.next=newnode;
       tail=newnode;
   }
   public void remove(){
       if (head==null){
           System.out.println("queue is empty");
       }
       int result=head.data;
       System.out.println(result+" is remove in queue");
       head=head.next;
   }
   public void print(){
       Node newnode=head;
       while (newnode!=null){
           System.out.println(newnode.data);
           newnode=newnode.next;
       }
   }

    public static void main(String[] args) {
        queue_Using_Linkedlist obj= new queue_Using_Linkedlist();
        obj.Add(1);
        obj.Add(2);
        obj.Add(3);
        obj.Add(4);
        obj.print();
        obj.remove();
        obj.print();
    }
}
