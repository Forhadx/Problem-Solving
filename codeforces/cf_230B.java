
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
 
public class cf_230B {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
 
        int num = 1000000;
        Set<Long> arr = new HashSet<>();
        arr.add(4L);
        
        int[] bool = new int[num+1];
 
        for(int i=3; i<=num; i+=2){
            if(bool[i] == 0){
                arr.add((long)i*i);
                for(int j=i; j<=num; j+=i){
                    bool[j] = 1;
                }
            }
        }

        StringBuilder str = new StringBuilder();

        int n = inp.nextInt();
        while(n > 0){
            long x = inp.nextLong();
            if(!arr.contains(x)){
                // System.out.println("NO");
                str.append("NO\n");
            }else{
                str.append("YES\n");
                // System.out.println("YES");
            }
            n--;
        }
        System.out.print(str);       
 
        inp.close();
    }
}