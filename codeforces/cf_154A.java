
import java.util.ArrayList;
import java.util.Scanner;

public class cf_154A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(s.nextInt());
        arr.add(s.nextInt());
        arr.add(s.nextInt());
        arr.add(s.nextInt());

        arr.sort(null);
        
        int c = arr.get(arr.size()-1) - arr.get(0); 
        int a = arr.get(1) - c;
        int b = arr.get(2) - c;

        System.out.println(a+" "+b+" "+c);

        s.close();
    }
}