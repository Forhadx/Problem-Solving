
import java.util.Scanner;

public class cf_466A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        int a = s.nextInt();
        int b = s.nextInt();

        float singleRide = (float)b/(float)m;

        if(a < singleRide){
            System.out.println(a*n);
        }else{
            if(n%m == 0){
                System.out.println((n/m)*b);
            }else{
                int x = ((n/m)*b) + b;
                int y = ((n/m)*b)+((n%m)*a);
                System.out.println(Math.min(x, y) );

            }
        }

        s.close();
    }
}