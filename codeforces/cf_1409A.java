
import java.util.Scanner;

public class cf_1409A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-- > 0){
            int a = s.nextInt();
            int b = s.nextInt();
            
            int val = Math.abs(a-b);
    
            int ans = val/10;
            int ex = val%10;
    
            if(ex !=0) ans += 1;
    
            System.out.println(ans);
        }

        s.close();
    }
}