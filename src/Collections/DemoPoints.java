package Collections;
import java.util.*;

public class DemoPoints {
    public static void main(String[] args) {
        PointsCollection hashmap = new PointsCollection();
        Points a = new Points(1, 2, "red", "point A");
        Points b = new Points(2, 2, "white", "point B");
        Points c = new Points(4, 7, "blue", "point C");
        Points d = new Points(1, 2, "red", "point D");
        Points e = new Points(1, 2, "red", "point A");

        hashmap.addToHashMap("Ann", d);
        hashmap.addToHashMap("nnn", b);
        hashmap.addToHashMap("Ann", c);
        hashmap.addToHashMap("Ann", a);
        hashmap.addToHashMap("VVV", d);
        hashmap.addToHashMap("ZZZ", e);

        System.out.println(hashmap.map);
        System.out.println(hashmap.reversedMap(hashmap.map));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        System.out.println(list);
        countOfElement(list);


    }

    public static void countOfElement(ArrayList<Integer> list) {
        HashSet<Integer> set = new HashSet<>(list);
        for (Integer i : set) {
            System.out.println("Frequency of " + i + ": " + Collections.frequency(list, i));
        }
    }
}




