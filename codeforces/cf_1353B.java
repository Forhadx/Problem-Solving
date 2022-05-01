import java.util.ArrayList;
import java.util.Scanner;


public class cf_1353B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0){
            int n = s.nextInt();
            int k = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int i = 0;

            for(i=0; i<n; i++){
                a[i] = s.nextInt();
            }
            for(i=0; i<n; i++){
                b[i] = s.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            for(i=0; i<k; i++){
                if(a[i] < b[n-i-1]){
                    a[i] = b[n-i-1];
                }else{
                    break;
                }
            }
            
            int sum = 0;
            for(int num: a){
                sum += num;
            }

            System.out.println(sum);
            
            t--;
        }

        s.close();
    }
}