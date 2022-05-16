
import java.util.ArrayList;
import java.util.Scanner;

public class cf_155A {
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int x = inp.nextInt();
            arr.add(x);
        }

        int min = arr.get(0);
        int max = arr.get(0);
        
        int k = 0;
        for(int i=1; i<n; i++){
            if(arr.get(i) < min){
                min = arr.get(i);
                k++;
            }
            if(arr.get(i) > max){
                max = arr.get(i);
                k++;
            }
        }
        System.out.println(k);


        inp.close();
    }
}

