import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        // Create HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Add elements
        map.put(1, "Aliya");
        map.put(2, "Rahul");
        map.put(3, "John");

        // Display all elements
        System.out.println(map);

        // Display using loop
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
