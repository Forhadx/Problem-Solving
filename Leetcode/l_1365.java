// 1365. How Many Numbers Are Smaller Than the Current Number


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ansArr = new int[nums.length];
        int k = 0;

        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(i==j) continue;
                if(nums[i]>nums[j]){
                   count += 1;
                }
            }
            ansArr[k++] = count;
        }

        for(int n: ansArr){
            System.out.println(n);
        }
        return ansArr;
    }
}



public class l_1365 {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};

        Solution obj = new Solution();
    
        obj.smallerNumbersThanCurrent(arr);
    }
}
