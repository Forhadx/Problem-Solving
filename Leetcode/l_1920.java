// 1920. Build Array from Permutation



class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] newArr = new int[len];

        for(int i=0; i<len; i++){
            newArr[i] = nums[nums[i]];
            // System.out.print(newArr[i]+" ");
        }
        
        return newArr;

    }
}

public class l_1920 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};

        Solution obj = new Solution();

        obj.getConcatenation(arr);  // 0 1 2 4 5 3
    }
}
