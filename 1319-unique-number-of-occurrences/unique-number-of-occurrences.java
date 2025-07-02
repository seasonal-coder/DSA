class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        //freq counter
        //uniquecheck

        Map<Integer, Integer> map =  new HashMap<>();
        for (int i : arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

       Set<Integer> set = new HashSet<>();
        for (int val : map.values()) {
        if (!set.add(val)) return false;
        }
        return true;

    }
}