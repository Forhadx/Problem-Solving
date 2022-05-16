
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class cf_4c {
 
    // Driver Code
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);

        Map<String, Integer> lists = new HashMap<>();
        StringBuilder str = new StringBuilder();

        int n = inp.nextInt();

        while(n-- > 0){
            String s = inp.next();
            if(lists.get(s) != null ){
                int count = lists.get(s);
                lists.put(s, count+1);
                s += count;
                // System.out.println(s);
                str.append(s+"\n");
            }else{
                lists.put(s, 1);
                // System.out.println("OK");
                str.append("OK\n");
            }
        }
        System.out.print(str.toString());

        inp.close();
    }
}

