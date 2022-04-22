// 1431. Kids With the Greatest Number of Candies


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> boolArr = new ArrayList<Boolean>();
        int maxCandi = Arrays.stream(candies).max().getAsInt();

        for(int i: candies){
            if(i+extraCandies >= maxCandi ){
                boolArr.add(true);
            }else{
                boolArr.add(false);
            }
        }
        return boolArr;
    }
}



public class l_1431 {
    public static void main(String[] args) {
        int[] arr = {12, 1, 12};

        Solution obj = new Solution();

         obj.kidsWithCandies(arr,10);   // [true, false, true]
    }
}
