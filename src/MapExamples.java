import java.util.HashMap;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        contacts.put("Fred","705-555-1234");
        contacts.put("Betty","416-555-7890");
        contacts.put("Arnold","905-555-1254");
        contacts.put("Arnold","563-777-9823");

        for (String key: contacts.keySet())
            System.out.printf("key: %-8s   Value: %-10s%n", key, contacts.get(key));

        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Fred","705-555-1234");
        treeMap.put("Betty","416-555-7890");
        treeMap.put("Arnold","905-555-1254");
        treeMap.put("Arnold","563-777-9823");

        for (String key: treeMap.keySet())
            System.out.printf("key: %-8s   Value: %-10s%n", key, treeMap.get(key));

    }
}
