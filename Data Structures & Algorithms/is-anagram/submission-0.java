class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        char[] sArray = s.toCharArray();
        for(char c : sArray) {
            if(sMap.containsKey(c)) {
                sMap.put(c, sMap.get(c) + 1);
            } else {
                sMap.put(c, 1);
            }
        }
        Map<Character, Integer> tMap = new HashMap<>();
        char[] tArray = t.toCharArray();
        for(char c : tArray) {
            if(tMap.containsKey(c)) {
                tMap.put(c, tMap.get(c) + 1);
            } else {
                tMap.put(c, 1);
            }
        }

        return sMap.equals(tMap);
    }
}
