
import java.util.Scanner;

public class cf_148A {
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int k = s.nextInt();
        int l = s.nextInt();
        int m = s.nextInt();
        int n = s.nextInt();
        int d = s.nextInt();

        int[] arr = new int[d+1];

        for(int i=1; i<=d; i++) arr[i]=i;

        int ans = 0;
        for(int i=1; i<=d; i++){
            if(arr[i]%k == 0 || arr[i]%l == 0 || arr[i]%m == 0 || arr[i]%n == 0 ){
                ans++;
            }   
              
        }

        System.out.println(ans);


        s.close();
       
    }
}

