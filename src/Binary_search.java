
public class Binary_search {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int start=0;
        int ele=5;
        int end=arr.length-1;
        int mid =(start+end)/2;
        //int mid = logic
        while (start<=end){
            if(arr[mid]==ele){
                System.out.println(mid);
                break;
            }
            else if (arr[mid]>ele){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
            mid=(start+end)/2;
        }

    }
}
