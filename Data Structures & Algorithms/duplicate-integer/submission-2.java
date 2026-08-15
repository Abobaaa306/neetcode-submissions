class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> d = new ArrayList<>();
        for(int num : nums) {
            if(d.contains(num)) {
                return true;
            }
            d.add(num);
        }
        return false;
    }
}