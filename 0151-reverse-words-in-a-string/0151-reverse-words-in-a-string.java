class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        int right = s.length() - 1;

        while (right >= 0) {

            // Skip spaces
            while (right >= 0 && s.charAt(right) == ' ') {
                right--;
            }

            if (right < 0) {
                break;
            }

            int left = right;

            // Find the beginning of the word
            while (left >= 0 && s.charAt(left) != ' ') {
                left--;
            }

            // Add space before every word except the first one
            if (sb.length() > 0) {
                sb.append(' ');
            }

            // Append the word
            for (int i = left + 1; i <= right; i++) {
                sb.append(s.charAt(i));
            }

            right = left - 1;
        }

        return sb.toString();
    }
}