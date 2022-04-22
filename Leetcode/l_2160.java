// 2160. Minimum Sum of Four Digit Number After Splitting Digits

import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {
        String str = Integer.toString(num);

        char[] numArr = str.toCharArray();
        
        Arrays.sort(numArr);

        String a =  Character.toString(numArr[0])+ Character.toString(numArr[2]);
        String b =  Character.toString(numArr[1])+ Character.toString(numArr[3]);
       System.out.println(Integer.parseInt(a)+Integer.parseInt(b));

       
    
        return Integer.parseInt(a)+Integer.parseInt(b);
    }
}



public class l_2160 {
    public static void main(String[] args) {
        int num = 4009;

        Solution obj = new Solution();

         obj.minimumSum(num); 
    }
}
