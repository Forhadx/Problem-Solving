// 1720. Decode XORed Array

class Solution {
    public int[] decode(int[] encoded, int first) {
        int len = encoded.length+1;
        int[] arr = new int[len];
        
        arr[0] = first;
        for(int i=0; i<len-1; i++){
           arr[i+1] = (encoded[i] ^ arr[i]);
        }
        
        return arr;
    }
}


public class l_1720 {
    public static void main(String[] args) {
        Solution obj = new Solution();

      int[]  arr = {0, 6};
      obj.decode(arr, 5);
    }
}
