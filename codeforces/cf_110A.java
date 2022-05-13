
import java.util.Scanner;

public class cf_110A {
 

    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
 
        String n = s.next();

        int a = 0;
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i) == '4' || n.charAt(i) =='7' ) a++;
        }
        if(a == 4 || a == 7) System.out.println("YES");
        else System.out.println("NO");

        s.close();
       
    }
}

