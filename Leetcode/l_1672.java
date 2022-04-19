// 1672. Richest Customer Wealth



import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] sumArray = new int[accounts.length];

        for(int i = 0; i<accounts.length; i++){
            int sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            sumArray[i] = sum;
        }

        Arrays.sort(sumArray);
        
        // System.out.println(sumArray[sumArray.length-1]);

        return sumArray[sumArray.length-1];
    }
}

public class l_1672 {
    public static void main(String[] args) {
        int[][] arr = {{1,5}, {7,3},{3,5}};

        Solution obj = new Solution();

        obj.maximumWealth(arr);  //  10
    }
}
