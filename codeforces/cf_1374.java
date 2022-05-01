public class cf_1374 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0){
            int x = s.nextInt();
            int y = s.nextInt();
            int n = s.nextInt();    
            System.out.println(n-(n-y)%x);
            t--;
        }
        s.close();
    }
}
