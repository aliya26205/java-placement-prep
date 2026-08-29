import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        int[] arr = {2, 3, 2, 4, 3, 2, 5};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : map.keySet()) {
            System.out.println(num + " -> " + map.get(num));
        }
    }
}
