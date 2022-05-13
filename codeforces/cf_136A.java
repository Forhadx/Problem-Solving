
import java.util.Scanner;

public class cf_136A {
 

    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] ans = new int[n+1];

        for(int i=1; i<=n; i++){
            int x = s.nextInt();
            ans[x] = i;
        }

        for(int i=1; i<=n; i++){
            System.out.println(ans[i]);
        }

        s.close();
       
    }
}
