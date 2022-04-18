public class Stack_using_Array {
    int arr[];
    int top;
    int size;
    Stack_using_Array(int size){
        this.size=size;
        arr=new int[size];
        top=-1;
    }
    public  void push(int data){
        if (top==size-1){
            System.out.println(" stack is full");
            return;
        }
        arr[top+1]=data;
        System.out.println( data+ " data is inserted");
        top++;
    }
    public  void pop(){
        if (top==-1){
            System.out.println(" stack is empty");
            return;
        }
        System.out.println(arr[top]+" is pop");
        top--;
    }
    public  void peek(){
        if (top==-1){
            System.out.println("stack is empty");
        }
        System.out.println(arr[top]+"  is top of stack");
    }
    public  void print(){
        for (int i = 0; i <size ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack_using_Array obj=new Stack_using_Array(5);
       obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.peek();
        obj.pop();
        obj.print();
        obj.peek();


    }
}
