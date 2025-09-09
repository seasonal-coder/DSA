class Solution {
    public int[] decode(int[] encoded, int first) {
        //a^b^b = a // so here b cancels out. we have given encoded one wwhich has given and the first el
        // encoded[i] = arr[i] XOR arr[i + 1] --> to geet arr[i] hav to xor again with arr[i+1]
        //encoded[i] ^ arr[i+1]  = arr[i]
        // but we dont have arr[i+1] we have to get it
        //arr[i]^arr[i+1]=e[i]
        //arr[i+1]=e[i]^arr[i]

        int[] arr = new int[encoded.length + 1];
        arr[0] = first;

        for(int i = 0; i<encoded.length; i++){
            arr[i+1] = encoded[i]^arr[i];

        }
        return arr;
    }
}