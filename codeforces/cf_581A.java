
import java.util.Scanner;
 
public class cf_581A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int same = (max - min)/2;

        System.out.println(min+" "+same);
 
        s.close();
    }
}