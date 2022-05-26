
import java.util.ArrayList;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer>arr = new ArrayList<Integer>();

        arr.add(s.nextInt());
        arr.add(s.nextInt());
        arr.add(s.nextInt());

        arr.sort(null);

        System.out.println(arr.get(arr.size()-1) - arr.get(0));

        s.close();
    }
}