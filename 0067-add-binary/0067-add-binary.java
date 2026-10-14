class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop as long as there are characters left to process or a carry exists
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            // Add bit from string a if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            // Add bit from string b if available
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            // Append the new bit (sum % 2) to the result
            result.append(sum % 2);

            // Calculate the new carry (sum / 2)
            carry = sum / 2;
        }

        // The bits were added in reverse order, so reverse the builder before converting to string
        return result.reverse().toString();
    }
}
