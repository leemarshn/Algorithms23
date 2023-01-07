import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args) {

        int[] arr = {10, 1, 1, 1, 1, 1, 1, 3, 3, 4, 4, 5, 5, 4, 7, 7, 8, 8};

        // System.out.println(findNotRepeat(arr));

        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : arr) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int val = entry.getValue();
            int key = entry.getKey();
            System.out.println(key + ":" + val);
        }
    }

    static int findNotRepeat(int[] nums) {
// Create a hash map to store the counts of each number
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (int num : nums) {
            if (counts.get(num) == 1) {
                return num;
            }
        }
        return -1;

    }
}
