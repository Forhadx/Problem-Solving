
import java.util.ArrayList;
import java.util.Scanner;

public class cf_337A {
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        ArrayList<Integer>arr = new ArrayList<>();
         
        for(int i=0; i<m; i++){
            int x = s.nextInt();
            arr.add(x);
        }

        arr.sort(null);

        int ans = arr.get(arr.size()-1) - arr.get(0);

        for(int i=0; i<=m-n; i++){
            int sum = 0;
            for(int j=i; j<i+n-1; j++){
                sum += (arr.get(j+1) - arr.get(j));
            }
            if(sum < ans) ans = sum;
        }

        System.out.println(ans);


        s.close();
       
    }
}

