// 1221. Split a String in Balanced Strings

class Solution {
    public int balancedStringSplit(String s) {
        char[] ch = s.toCharArray();
        int ans = 0;
        int R = 0; 
        int L = 0; 
        for(int i=0; i<ch.length; i++){
            if(ch[i] == 'R') R++;
            if(ch[i] == 'L') L++;
            if(R==L){
                ans+=1;
                R = 0;
                L = 0;
            }
        }
        return ans;
    }
}

public class l_1221 {
    public static void main(String[] args) {
        String s = "RRLRRLRLLLRL"; // 2
      
      Solution obj = new Solution();

      obj.balancedStringSplit(s);
    }
}
