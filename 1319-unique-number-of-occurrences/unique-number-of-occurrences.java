class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
  Set<Integer> set = new HashSet<>();
  for(int num : arr){
    if (!map.containsKey(num)){
      map.put(num,1);
    }else{
    map.put(num, map.get(num)+1);
    }
  }
  for (int freq : map.values()){
    if (set.contains(freq)){
      return false;
    }
    set.add(freq);
  }
  return true;
    }
}