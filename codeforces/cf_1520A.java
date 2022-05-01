import java.util.ArrayList;
import java.util.Scanner;

public class cf_1520A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0){
            int n = s.nextInt();
            String str  = s.next();
            char[] ch = str.toCharArray();
            ArrayList<Character> st = new ArrayList<Character>();
            Boolean bool = true;
    
            for(int i=1; i<ch.length; i++){
                if(st.indexOf(ch[i]) != -1){
                    bool = false;
                    break;
                }
                if(ch[i-1]!=ch[i]){
                    st.add(ch[i-1]);
                }
            }
            if(bool){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
        s.close();
    }
}


/*
    in: 
        5
        3
        ABA
        11
        DDBBCCCBBEZ
        7
        FFGZZZY
        1
        Z
        2
        AB

    op:
        NO
        NO
        YES
        YES
        YES

*/
