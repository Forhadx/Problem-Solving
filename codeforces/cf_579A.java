
import java.util.Scanner;

public class cf_579A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        System.out.println(Integer.bitCount(x));

        s.close();
    }
}