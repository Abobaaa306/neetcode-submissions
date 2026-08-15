class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> d = new HashSet<>();
        for(int num : nums) {
            if(d.contains(num)) {
                return true;
            }
            d.add(num);
        }
        return false;
    }
}