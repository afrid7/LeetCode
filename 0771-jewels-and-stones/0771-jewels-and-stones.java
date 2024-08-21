import java.util.HashMap;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
      
        HashMap<Character, Integer> charCounts = new HashMap<>();

      
        for (char c : stones.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for (char c : jewels.toCharArray()) {
            count += charCounts.getOrDefault(c, 0);
        }

        return count;
    }
}
