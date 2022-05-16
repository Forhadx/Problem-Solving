

import java.util.Scanner;

public class cf_496A {
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
 
        int[] ans = new int[n+1];
 
        int p = s.nextInt();
        for(int i=0; i<p; i++){
            int x = s.nextInt();
            ans[x] = x;
        }
        
        int q = s.nextInt();
        for(int i=0; i<q; i++){
            int x = s.nextInt();
            ans[x] = x;
        }
 
        boolean bool = true;
        for(int i=1; i<n+1; i++){
            if(ans[i] == 0) bool = false;
        }
 
        if(bool){
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
        }
      
        s.close();
       
    }
}

