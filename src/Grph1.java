import java.util.HashMap;

public class Grph1 {
    public static void main(String[] args) {
        HashMap<String ,Integer> obj=new HashMap<>();
        obj.put("abhi",1);
        obj.put("abhi",2);

        int res=obj.get("abhi");
        System.out.println(res);
    }
}
