public class cf_1360A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0){
           int a = s.nextInt();
           int b = s.nextInt();

           if(a==b){
               System.out.println((a+a)*(a+a));
           }else if(a+a == b){
               System.out.println(b*b);
           }else if(a == b+b){
                System.out.println(a*a);
           }else if((a < b) && (a+a > b)){
               System.out.println((a+a)*(a+a));
           }else if((a>b)&&(a < b+b)){
               System.out.println((b+b)*(b+b));
           }else if(a > b){
               System.out.println((a*a));
            }else if(a < b){
               System.out.println((b*b));
           }
            
            t--;
        }

        s.close();
    }    
}
