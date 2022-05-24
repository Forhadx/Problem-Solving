
import java.util.Scanner;

public class cf_732A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int k = s.nextInt();
        int r = s.nextInt();

        int sum = k;
        int ans = 0;
        boolean bool = true;
        
        while(bool){
            if(((sum%10)-r) == 0) bool = false;
            if((sum%10) == 0) bool = false;
            ans++;
            sum += k;
        }
        System.out.println(ans);

        s.close();
    }
}