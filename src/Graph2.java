import java.util.HashMap;

public class Graph2 {
    HashMap<Integer, LinkedList<Integer>>obj;
    public Graph2(){
        obj=new HashMap<>();
    }
            public void addedge(int v1,int v2,boolean bidirectional){
        LinkedList<Integer> v1neighbour =obj.getOrDefault(v1,new LinkedList());
        v1neighbour.add(v2);
        obj.put(v1,v1neighbour);

}



   // static Scanner sc=new Scanner(System.in);
//    public static void main(String[] args) {
//
////        obj.put("abhi1",1);
////        obj.put("abhi2",2);
////        obj.put("abhi3",3);
////
////        int res=obj.get("abhi");
////        System.out.println(res);
//        for (Map.Entry<String,Integer>res :obj.entrySet()){
//            System.out.print(res.getKey()+" --> ");
//            System.out.print(res.getValue());
//            System.out.println(" ");
//        }
//    }
               //  HashMap<String ,Integer> obj=new HashMap<>();

}
