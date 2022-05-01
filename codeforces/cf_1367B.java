public class cf_1367B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t > 0){
            int even = 0;
            int odd = 0;
            int n = s.nextInt();
    
            for(int i=0; i<n; i++){
                int x = s.nextInt();
                if(i%2==0 && x%2 != 0 ){
                    odd += 1;
                }
                if(i%2!=0 && x%2 == 0){
                    even += 1;
                }
            }
    
            if(odd != even){
                System.out.println(-1);
            }else{
                System.out.println(even);
            }
            
            t--;
        }
        
       
        s.close();
    }   
}
