
import java.util.Scanner;

public class cf_486A {
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        long n = s.nextLong();

        if(n%2 == 0){
            System.out.println(n/2);
        }else{
            System.out.println(((n-1)/2)-n);
        }
        s.close();
       
    }
}

