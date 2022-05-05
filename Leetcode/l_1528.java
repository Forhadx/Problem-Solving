// 1528. Shuffle String

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        char[] newCh = new char[indices.length];
        
        for(int i=0; i<indices.length; i++){
            newCh[indices[i]] = ch[i];
        }
        
        String str = String.valueOf(newCh);
        
        return str;
    }
}

public class l_1528 {
    public static void main(String[] args) {
        Solution obj = new Solution();

        String s = "codeleet";
        int[]  indices = {4,5,6,7,0,2,1,3};
  
        obj.restoreString(s, indices);
  
    }
}
