
import java.util.ArrayList;
import java.util.Scanner;

public class cf_1399A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       int t = s.nextInt();

       while(t-- > 0){
           int n = s.nextInt();
           ArrayList<Integer> arr = new ArrayList<Integer>();

            for(int i=0; i<n; i++){
                arr.add(s.nextInt());
            }

            arr.sort(null);

            for(int i=0; i<n-1; i++){
                if(Math.abs( arr.get(i)-arr.get(i+1)) <=1 ){
                    if(arr.get(i) > arr.get(i+1)){
                        arr.remove(i+1);
                    }else{
                        arr.remove(i);
                    }
                    n = arr.size();
                    i = -1;
                    continue;
                }
                if(arr.get(i) == arr.get(i+1)){
                    arr.remove(i+1);
                    n = arr.size();
                    i = -1;
                    continue;
                }
            }

            if(arr.size()<=1){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

       }

        s.close();
    }
}