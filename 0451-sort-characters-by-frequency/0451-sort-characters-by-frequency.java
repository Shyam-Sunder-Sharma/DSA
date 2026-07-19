class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> hm = new HashMap<>();

        // Count frequencies
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // Store unique characters
        ArrayList<Character> list = new ArrayList<>(hm.keySet());

        // Sort characters according to frequency (highest first)
        Collections.sort(list, (a, b) -> hm.get(b) - hm.get(a));

        StringBuilder sb = new StringBuilder();

        // Build answer
        for (char c : list) {
            int freq = hm.get(c);

            while (freq-- > 0) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}