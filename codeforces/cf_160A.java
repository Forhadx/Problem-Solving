
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class cf_160A {
 

    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
 
        int n = s.nextInt();

        ArrayList<Integer> a = new ArrayList<Integer>();

        for(int i=0; i<n; i++) {
            int x = s.nextInt();
            a.add(x);
        }

        Collections.sort(a, Collections.reverseOrder());

        for(int i=0; i<n; i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j=0; j<=i; j++){
                sum1 += a.get(j);
            }
            for(int k=i+1; k<n; k++){
                sum2 += a.get(k);
            }
            if(sum1 > sum2){
                System.out.println(i+1);
                break;
            }
        }

        s.close();
       
    }
}

