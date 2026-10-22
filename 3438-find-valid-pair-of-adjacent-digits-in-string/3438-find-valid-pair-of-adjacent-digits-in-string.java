import java.util.HashMap;

class Solution {
    public String findValidPair(String s) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            int n = s.charAt(i) - '0'; 
            
            if (hm.containsKey(n)) {
                int p = hm.get(n);
                hm.put(n, p + 1);
            } else {
                hm.put(n, 1);
            }
        }
        
        for (int i = 0; i < s.length() - 1; i++) {
            int first = s.charAt(i) - '0';
            int second = s.charAt(i + 1) - '0';
            
            if (first != second) {
                if (hm.get(first) == first && hm.get(second) == second) {
                    return "" + first + second;
                }
            }
        }
        
        return "";
    }
}
