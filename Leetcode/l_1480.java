// 1480. Running Sum of 1d Array

class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] newArr = new int[len];

        newArr[0] = nums[0];
        for(int i=1; i<len; i++){
            newArr[i] = newArr[i-1] + nums[i];
        }
        return newArr;

    }
}

public class l_1480 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};

        Solution obj = new Solution();

        obj.getConcatenation(arr);  //  [1,2,3,4,5]
    }
}
