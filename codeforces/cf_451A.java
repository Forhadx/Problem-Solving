
import java.util.Scanner;

public class cf_451A {
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

       int m = s.nextInt();
       int n = s.nextInt();

       int x = Math.min(m, n);

       if(x%2 == 0){
           System.out.println("Malvika");
       }else{
           System.out.println("Akshat");
       }

        s.close();
       
    }
}

