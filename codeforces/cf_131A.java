
import java.util.Scanner;

public class cf_131A {
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        String str = s.next();
        String ans = "";

        if(str.length() == 1 && Character.isLowerCase(str.charAt(0))){
            ans = str.toUpperCase();
        }else if(Character.isUpperCase(str.charAt(0))){
            int up = 1;
            for(int i=1; i<str.length(); i++){
                if(Character.isUpperCase(str.charAt(i))) up++;
            }
            if(up == str.length()){
                ans = str.toLowerCase();
            }else{
                ans = str;
            }
        }else{
            int up = 1;
            for(int i=1; i<str.length(); i++){
                if(Character.isUpperCase(str.charAt(i))) up++;
            }
            if(up == str.length()){
                ans = str.toLowerCase();
               char[] ch = ans.toCharArray();
               ch[0] = Character.toUpperCase(ch[0]);
               ans = String.valueOf(ch);
            }else{
                ans = str;
            }
        }
      
        System.out.println(ans);
        s.close();
       
    }
}

