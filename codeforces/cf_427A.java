
import java.util.Scanner;
 
public class cf_427A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        int[] arr = new int[n];
        int ans = 0;
        int hire = 0;

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();

            if(arr[i] == -1){
                if( hire == 0){
                    ans += 1;
                }else{
                    hire -= 1;
                }

            }
            if(arr[i] >= 1){
                hire += arr[i];
            }
        }
        System.out.println(ans);
 
        s.close();
    }
}