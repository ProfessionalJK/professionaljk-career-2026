public class Solution {

    public static void main(String[] args) {
        System.out.println(findTheLongestSubstring("abcabcbb"));
        System.out.println(findTheLongestSubstring("bbbbb"));
        System.out.println(findTheLongestSubstring("pwwkew"));
        System.out.println(findTheLongestSubstring(""));
        System.out.println(findTheLongestSubstring("au"));
        System.out.println(findTheLongestSubstring("abba"));
    }

    public static int findTheLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        java.util.Map<Character, Integer> charIndexMap = new java.util.HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                left = charIndexMap.get(currentChar) + 1;
            }
            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}