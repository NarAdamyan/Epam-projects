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
    }
    public Map<Points, List<String>> valueToKey(Map<String, Points> map) {
        Map<Points, List<String>> reverseMap = new HashMap<Points, List<String>>();
        for (Map.Entry<String, Points> o : map.entrySet()) {
            String s = o.getKey();
            Points p = o.getValue();
            if (Collections.frequency(map.values(), p) == 1) {
                reverseMap.put(p, Arrays.asList(s));
            } else if (Collections.frequency(map.values(), p) > 1) {
                ArrayList<String> values = new ArrayList<>();
                values.add(s);
                reverseMap.computeIfAbsent(p, k -> new ArrayList<>()).add(s);
            }
        }
        return reverseMap;
    }
}
