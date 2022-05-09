// 2194. Cells in a Range on an Excel Sheet

import java.util.List;
import java.util.ArrayList;


class Solution {
    public List<String> cellsInRange(String s) {
        char[] ch = s.toCharArray();
        
        List<String> str = new ArrayList<String>();
        
        for(char c=ch[0]; c<=ch[3]; c++){
            String st = "";
            if(ch[1] == ch[4]){
                st = ""+c+ch[1];
                str.add(st);
            }else{
                for(char c2=ch[1]; c2<=ch[4]; c2++){
                    st = ""+c+c2;
                    str.add(st);
                }
            }
        }
        
        return str;
    }
}


public class l_2194 {
    public static void main(String[] args) {
        
    }
}
