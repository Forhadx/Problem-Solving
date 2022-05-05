// 1313. Decompress Run-Length Encoded List

import java.util.ArrayList;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer>arr = new ArrayList<Integer>();

        int totalLen = 0;
        for(int i=0; i<nums.length; i++){
            if(2*i <= (nums.length - 2)){
                arr.add(nums[2*i]);
                arr.add(nums[2*i+1]);

            
                totalLen += nums[2*i];
            }
            
        }
                
        int[] ansArr = new int[totalLen];
        int k=0;

        for(int i=0; i<arr.size(); i+=2){
            for(int j=0; j<arr.get(i); j++){
                ansArr[k++]= arr.get(i+1);
            }
        }

        return ansArr;
    }
}



public class l_1313 {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[]  arr = {1,2,3,4};
        obj.decompressRLElist(arr);
    }
}
