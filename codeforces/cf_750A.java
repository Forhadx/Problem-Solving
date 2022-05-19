
import java.util.Scanner;
 
public class cf_750A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int k  = s.nextInt();

        int remain = 240 - k;

        int ans = 0;
        for(int i=1; i<=n; i++){
            if(remain >= 5*i ){
                remain -= 5*i;
                ans += 1;
            }else{
                break;
            }
        }
        System.out.println(ans);
 
        s.close();
    }
}