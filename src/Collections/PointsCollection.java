package Collections;

import java.util.*;

public class PointsCollection {
    Map<String, Points> map;

    public PointsCollection() {
        map = new HashMap<>();
    }

    public void addToHashMap(String name, Points p) {
        map.put(name, p);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Map: {");
        for (Map.Entry<String, Points> entry : map.entrySet()) {
            sb.append(entry.getKey()).append("=").append(entry.getValue()).append(", ");
        }
        if (!map.isEmpty()) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    public void hashToTreeMap() {
        TreeMap<String, Points> tree = new TreeMap<>(this.map);
        System.out.println(tree);
    }

    public Map<Points, String> reversedMap(Map<String, Points> map) {
        Map<Points, String> reversedMap;
        if (map instanceof HashMap) {
            reversedMap = new HashMap<>();
        } else if (map instanceof TreeMap) {
            reversedMap = new TreeMap<>();
        } else {
            reversedMap = new HashMap<>();
        }

        for (Map.Entry<String, Points> entry : map.entrySet()) {
            String s = entry.getKey();
            Points p = entry.getValue();
            reversedMap.put(p, s);
        }
        return reversedMap;
    }
}

