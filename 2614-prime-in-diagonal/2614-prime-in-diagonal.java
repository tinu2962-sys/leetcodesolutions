import java.util.Collections;
import java.util.HashSet;

class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            int p1 = nums[i][i];
            if (isPrime(p1)) {
                hs.add(p1);
            }
            if (i != n - 1 - i) {
                int p2 = nums[i][n - 1 - i];
                if (isPrime(p2)) {
                    hs.add(p2);
                }
            }
        }
        if (hs.isEmpty()) {
            return 0;
        }
        
        return Collections.max(hs);
    }
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false; 
        }
        return true; 
    }
}
