// 1929. Concatenation of Array


class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] newArr = new int[len*2];

        System.arraycopy(nums, 0, newArr, 0, len);
        System.arraycopy(nums, 0, newArr, len, len);

        // for(int i: newArr){
        //     System.out.print(i+" ");
        // }

        return newArr;

    }
}

public class l_1929 {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1};

        Solution obj = new Solution();

        obj.getConcatenation(arr);  // [1, 3, 2, 1, 1, 3, 2, 1]
    }
}
