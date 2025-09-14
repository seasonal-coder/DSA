class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> ok = new HashSet<>();
        for(char c: allowed.toCharArray()) ok.add(c);

        int count =0;
        for(String w : words){
            boolean valid = true;
            for(char c : w.toCharArray()){
                if(!ok.contains(c)) {valid = false; break;}
            }
            if (valid) count++;
        }
        return count;
        
    }
}