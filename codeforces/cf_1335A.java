
import java.util.Scanner;

public class cf_1335A {
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        // System.out.println((int)2.2);

        int t = s.nextInt();

        while(t > 0){
            int n = s.nextInt();

            if(n%2 == 0){
                System.out.println((n/2)-1);
            }else{
                System.out.println((int)(Math.floor(n/2)));
            }

            t--;
        }

        s.close();
       
    }
}

