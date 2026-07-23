package in.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {
    public static void main(String[] args) {
        Map<String,Integer> map= new HashMap<>();
        map.put("Dibu",65);
        map.put("Piru",77);
        map.put("Faah",31);
        map.put("Kibe",54);

        System.out.println("Current size: "+map.size());
        System.out.println(map.get("Faah"));
        System.out.println(map.containsKey("Dibu"));
        System.out.println(map.containsValue(54));
        System.out.println(map.remove("Piru"));
        System.out.println("Current size: "+map.size());

        // For iteration
        for (String key: map.keySet()){
//            System.out.printf("Just keys: %s ",key);
            System.out.printf("Key-Values: %s : %s\n",key,map.get(key));
        }
        System.out.println(map.get("boy"));
    }
}
