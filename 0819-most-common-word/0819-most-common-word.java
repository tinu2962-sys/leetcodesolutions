import java.util.*;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert banned words array into a HashSet for O(1) lookups
        Set<String> bannedSet = new HashSet<>();
        for (String w : banned) {
            bannedSet.add(w.toLowerCase());
        }
        
        // Normalize the paragraph: convert to lowercase and replace all non-lowercase letters with spaces
        char[] chars = paragraph.toLowerCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 'a' || chars[i] > 'z') {
                chars[i] = ' ';
            }
        }
        
        // Split by spaces to extract individual words
        String[] words = new String(chars).split("\\s+");
        
        // Track the frequency of each valid word
        Map<String, Integer> counts = new HashMap<>();
        String mostFrequentWord = "";
        int maxCount = 0;
        
        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) {
                continue;
            }
            
            int count = counts.getOrDefault(word, 0) + 1;
            counts.put(word, count);
            
            // Keep track of the highest frequency word on the fly
            if (count > maxCount) {
                maxCount = count;
                mostFrequentWord = word;
            }
        }
        
        return mostFrequentWord;
    }
}
