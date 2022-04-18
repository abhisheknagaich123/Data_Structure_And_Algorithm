public class queue_Using_Array {
    int arr[];
    int size;
    int fornt;
    int rear;
    queue_Using_Array(int size){
        this.size=size;
        arr=new int[size];
        fornt=-1;
        rear=-1;
    }
    public void enque(int data){
        if (rear==size-1){
            System.out.println(" queue is full");
        }
        if (fornt==-1){
            fornt=0;
        }
        arr[++rear]=data;
        System.out.println(data+" insert ");
    }
    public void deque(){
        if (rear==-1){
            System.out.println(" empty");
        }
        System.out.println(arr[fornt]+"  is dequeue");
        if (fornt==rear){
            fornt=rear=-1;
        }
        else if (fornt>rear){
            rear++;
        }
    }
    public void traverse(){
        if (rear==-1 || fornt==-1){
            System.out.println(" queue is empty in traverse");
        }
        for (int i = fornt; i <=rear ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        queue_Using_Array obj=new queue_Using_Array(5);
        obj.enque(1);
        obj.enque(2);
        obj.enque(3);
        obj.enque(4);
        obj.enque(5);
        obj.traverse();
        obj.deque();
        obj.traverse();
    }
}
