class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> d = new HashMap<>();

        for(String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String b = new String(c);
            //We got the sorted charS to represent all anagrams of it.

            if(d.containsKey(b)) {
                d.get(b).add(s);
            } else {
                d.put(b, new ArrayList<>(Arrays.asList(s)));
            }
        }

        List<List<String>> retList = new ArrayList<>();
        
        d.forEach((key, value) -> {
            retList.add(value);
        });

        return retList;
    }

}
