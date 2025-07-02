class Solution {
   public boolean uniqueOccurrences(int[] arr) {
    int[] freq = new int[2001]; // index shift: -1000 to 1000 becomes 0 to 2000

    for (int num : arr) {
        freq[num + 1000]++;
    }

    Set<Integer> seen = new HashSet<>();
    for (int count : freq) {
        if (count == 0) continue;
        if (!seen.add(count)) return false;
    }

    return true;
}
}
