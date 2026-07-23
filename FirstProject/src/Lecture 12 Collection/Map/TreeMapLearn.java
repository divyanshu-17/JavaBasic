package in.Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapLearn {
    public static void main(String[] args) {
        TreeMap<Integer,String> map= new TreeMap<>();
        map.put(1000,"Tom");
        map.put(2000,"Peter");
        map.put(3000,"Kim");
        map.put(11000,"Liam");
        map.put(1400,"John");

        System.out.println(map);

        for (Map.Entry<Integer,String> e : map.entrySet()){
            int k= e.getKey();
            String v= e.getValue();

            System.out.println(k+" : "+v);
        }
        System.out.println(map.lastKey());
        System.out.println(map.firstKey());

        Set<Integer> keyLessThan3k= map.headMap(3000).keySet();
        System.out.println(keyLessThan3k);

        Set<Integer> keyGreaterThan3k= map.tailMap(3000).keySet();
        System.out.println(keyGreaterThan3k);
    }
}
