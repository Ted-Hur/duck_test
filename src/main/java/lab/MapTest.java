package lab;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String args[]) {

        Map<Integer, Map<Integer, Map<Integer, Integer>>> map1 = new HashMap<>();
        Map<Integer, Map<Integer, Integer>> map2 = new HashMap<>();
        Map<Integer, Integer> map3 = new HashMap<>();
        map3.put(22,0);
        map2.put(11,map3);
        map1.put(55,map2);

        System.out.println("all:" + map1);

        System.out.println(map1.get(55));
        System.out.println(map1.get(55).get(11));
        System.out.println(map1.get(55).get(11).get(22));
    }
}
