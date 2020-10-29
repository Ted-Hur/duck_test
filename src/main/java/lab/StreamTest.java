package lab;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,7,8,9,11,12,13,14,15);
        System.out.println(list.stream().anyMatch(item -> item == 3)); //true
        System.out.println(list.stream().anyMatch(item -> item == 5)); //false

        System.out.println(list.stream().filter(item->item > 20).anyMatch(item -> item == 3)); //false

        System.out.println(list.stream().filter(item->item > 10).noneMatch(item -> item == 5)); //true
        System.out.println(list.stream().filter(item->item > 10).noneMatch(item -> item == 15)); //false
        System.out.println(list.stream().filter(item->item > 20).noneMatch(item -> item == 15)); //true

        System.out.println(list.stream().filter(item->item > 10).allMatch(item -> item == 15)); //false
        System.out.println(list.stream().filter(item->item > 14).allMatch(item -> item == 15)); //true
        System.out.println(list.stream().filter(item->item > 13).allMatch(item -> item == 15 || item == 14)); //true
    }
}
