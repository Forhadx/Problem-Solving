
import java.util.Scanner;
import java.util.ArrayList; 

public class cf_492B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        int n = s.nextInt();
        int l = s.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            int x = s.nextInt();
            arr.add(x);
        }

        arr.sort(null);

        double dis = 0;

        if(dis < arr.get(0) ){
            dis = arr.get(0);
        }
        if(dis < (l - arr.get(arr.size() - 1)) ){
            dis = l - arr.get(arr.size() - 1);
        }
        
        for(int i=1; i<n; i++){
            double newDis = arr.get(i) - arr.get(i-1);
            newDis /= 2;

            if(dis < newDis ){
                dis = newDis;
            }
        }

        System.out.println(dis);

        s.close();
    }
}