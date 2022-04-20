// 2114. Maximum Number of Words Found in Sentences


class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        for(String str: sentences){
            String[] strArr = str.split(" ");
            if(strArr.length > ans) ans = strArr.length;
        }
        return ans;
    }
}

public class l_2114 {
   public static void main(String[] args) {
    String[] str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"}; 

    Solution obj = new Solution();

    int x =  obj.mostWordsFound(str);  
    System.out.println(x);
   } 
}
