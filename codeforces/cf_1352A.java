
import java.util.Scanner;

public class cf_1352A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        int[] z = {10, 100, 1000, 10000};

        while(t-- > 0){
            int n = s.nextInt();
            int len = String.valueOf(n).length();
            int k = 0;
            String str = "";

            while(len > 0){
                if(len == 1){
                    k++;
                    str += n + " ";
                    break;
                }else if(n%z[len-2] == 0 ){
                    str += n + " ";
                    k++;
                    break;
                }else{
                    k++;
                    int temp = n%z[len-2];
                    str += (n-temp) + " ";
                    n = temp;
                    len = String.valueOf(n).length();
                }
            }
            System.out.println(k);
            System.out.println(str);
        }

        s.close();
    }
}