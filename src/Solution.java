import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Use hasNextLine to ensure we don't crash on empty input
        if (sc.hasNextLine()) {
            String input = sc.nextLine().trim();
            
            if (input.isEmpty()) {
                sc.close();
                return;
            }

            // Split by one or more whitespace characters
            String[] words = input.split("\\s+");
            
            // TreeMap keeps the words in alphabetical order (A-Z)
            TreeMap<String, Integer> counts = new TreeMap<>();
            
            for (String word : words) {
                // update the count: if new, start at 0 and add 1
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
            
            // Print results: Word: Count
            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        
        sc.close();
    }
}
