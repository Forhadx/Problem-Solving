// 771. Jewels and Stones

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans = 0;

        char[] jChar = jewels.toCharArray();
        char[] sChar = stones.toCharArray();

        for(char s: sChar){
            for(char j: jChar){
                if(s==j) ans += 1;
            }
        }
        return ans;
    }
}


public class l_771 {
    public static void main(String[] args) {
        String str1 = "aA";
        String str2 = "aAAbbbb";

        Solution obj = new Solution();

        obj.numJewelsInStones(str1,str2);   // 3
    }
}
