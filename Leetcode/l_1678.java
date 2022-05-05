// 1678. Goal Parser Interpretation

class Solution {
    public String interpret(String command) {
        char[] ch = command.toCharArray();
        
        String str = "";
        
        for(int i=0; i<ch.length;){
            if(ch[i] == 'G'){
                str += "G";
                i++;
            }else if(ch[i]=='(' && ch[i+1] == ')'){
                str += "o";
                i += 2;
            }else if(ch[i]=='(' && ch[i+1]=='a' && ch[i+2]=='l' && ch[i+3] == ')'){
                str += "al";
                i += 4;
            }
        }
        
        return str;
    }
}

public class l_1678 {
    public static void main(String[] args) {
        String command = "G()()()()(al)";

        Solution obj = new Solution();
        obj.interpret(command);
    }   
}
