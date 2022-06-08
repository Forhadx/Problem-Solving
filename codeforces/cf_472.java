
import java.util.ArrayList;
import java.util.Scanner;

public class cf_472 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        primes.add(3);
        for(int i=4; i<1000000; i++){
            boolean bool = true;
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i%j==0){
                    bool = false;
                    break;
                }
            }
            if(bool) primes.add(i);
        }

        int n = s.nextInt();
        int a = 0;
        int b = 0;
    
        if(n%2 == 0){
            a = n/2;
            b = n/2;
        }else{
            a = n/2;
            b = n/2 + 1;
        }

        boolean f = true;
        while(f){
            if(primes.indexOf(a) != -1 || primes.indexOf(b) != -1){
                a -= 1;
                b += 1;
                continue;
            }else{
                System.out.println(a+" "+b);
                f = false;
            }
        }
        
        s.close();
    }
}