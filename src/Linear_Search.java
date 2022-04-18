import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n= sc.nextInt();
        String arr[]=new String[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Searching The String Element  ");
        String s= sc.next();
        String sear=s;
        for (int i=0;i<arr.length;i++){
            if(arr[i].equals(sear )){
                System.out.println("Element is present in this array at position "+i);

            }
        }

    }
}
