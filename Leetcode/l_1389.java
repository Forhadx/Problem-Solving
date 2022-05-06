// 1389. Create Target Array in the Given Order


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int len = nums.length;
        int[] ansArr = new int[len];
        
        for(int i=0; i<len; i++){
            if(index[i] < i ){
                for(int j=i; j>index[i]; j--){
                    ansArr[j] = ansArr[j-1];   
                }
                ansArr[index[i]] = nums[i];
            }else{
                ansArr[i] = nums[index[i]];
            }
        }
        
        return ansArr;
    }
}


public class l_1389{
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        Solution obj = new Solution();

        obj.createTargetArray(nums, index); // [0,4,1,3,2]
    }
}