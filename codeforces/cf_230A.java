
import java.util.Scanner;

public class cf_230A {
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        int s = inp.nextInt();
        int n = inp.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for(int i=0; i<n; i++){
            x[i] = inp.nextInt();
            y[i] = inp.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){ 
                if(x[j] > x[j+1]){
                    int tx = x[j];
                    x[j] = x[j+1];
                    x[j+1] = tx;
                    int ty = y[j];
                    y[j] = y[j+1];
                    y[j+1] = ty;
                }
            }
        }

        boolean bool = true;
        for(int i=0; i<n; i++){
            if(s > x[i]){
                s += y[i];
            }else{
                bool = false;
                break;
            }
        }

        if(bool){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
       
        inp.close();

       
    }
}

