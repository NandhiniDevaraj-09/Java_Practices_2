class lengthOfLongestSubstringSolution {
    public int lengthOfLongestSubstring(String str) {
        int maxLength = 0;
        for (int i = 0; i < str.length(); i++) {
            boolean[] visited = new boolean[256]; 
            for (int j = i; j < str.length(); j++) {
                char currentChar = str.charAt(j);
                if (visited[currentChar]) {
                    break;
                }
                visited[currentChar] = true;
                maxLength = Math.max(maxLength, j - i + 1);
            }
        }
        return maxLength;
    }
}