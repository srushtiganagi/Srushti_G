import java.util.*;

public class MultipleCounter {
    public static void main(String[] args) {
        // Input list
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
      
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Initialize with keys 1 to 9 and value 0
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        // Check each number in the list
        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Print the result
        System.out.println("Output:");
        System.out.println(countMap);
    }
}
