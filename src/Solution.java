import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read the entire line of text
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            
            // 2. Split the line into an array of words
            // "\\s+" matches one or more whitespace characters
            String[] words = input.split("\\s+");
            
            // 3. Create the HashMap
            HashMap<String, Integer> counts = new HashMap<>();
            
            // 4. Process each word
            for (String word : words) {
                if (word.isEmpty()) continue; // Ignore extra spaces
                
                // getOrDefault checks if word exists; if not, starts at 0
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
            
            // 5. Print the results in "Word: Count" format
            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        
        sc.close();
    }
}
