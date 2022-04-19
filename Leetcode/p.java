import java.util.Arrays;

// 1480. Running Sum of 1d Array

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

public class p {
    public static void main(String[] args) {
        int[][] arr = {{1,5}, {7,3},{3,5}};

        Solution obj = new Solution();

        obj.maximumWealth(arr);  //  [1,2,3,4,5]
    }
}
