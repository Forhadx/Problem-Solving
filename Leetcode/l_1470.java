// 1470. Shuffle the Array


class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] upNums = new int[nums.length];

        int j = 0;
        int k = n;

        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                upNums[i] = nums[j++] ;
            }else{
                upNums[i] = nums[k++];

            }
        }

        for(int i: upNums){
            System.out.print(i+" ");
        }
        
        return upNums;
    }
}


public class l_1470 {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};

        Solution obj = new Solution();

         obj.shuffle(arr, 3);   // [2,3,5,4,1,7]
    }
}
