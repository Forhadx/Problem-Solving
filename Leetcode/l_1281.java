// 1281. Subtract the Product and Sum of Digits of an Integer


class Solution {
    public int subtractProductAndSum(int n) {
        String str =Integer.toString(n);
        char[] numArr = str.toCharArray();
        int sum = 0;
        int multipy = 1;

        for(char num: numArr){
            sum += Character.getNumericValue(num);
            multipy *= Character.getNumericValue(num);

        }
        return multipy - sum;
    }
}



public class l_1281 {
   public static void main(String[] args) {
    Solution obj = new Solution();
    obj.subtractProductAndSum(234); // 15
   }
}
