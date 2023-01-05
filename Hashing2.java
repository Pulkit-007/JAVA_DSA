import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing2 {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();

        //Insertion
        map.put("China",150);
        map.put("USA",30);
        map.put("India",120);
        System.out.println(map);


        map.put("China",180);
        System.out.println(map);

        //search/contains
        if(map.containsKey("Indonesia"))
        {
            System.out.println("YEahh");
        }
        else
        {
            System.out.println("Nahhhhhh");
        }
        System.out.println(map.get("China"));

        //Iteration in HashMap
        for(Map.Entry<String,Integer>e :map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        Set<String> keys = map.keySet();
        for(String key: keys)
        {
            System.out.println(key+" "+map.get(key));
        }
        

        //Deletion
        map.remove("China");
        System.out.println(map);

    }

}
