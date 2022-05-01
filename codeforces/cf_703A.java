public class cf_703A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int mSum = 0;
        int cSum = 0;

        while(n > 0){
            int m = s.nextInt();
            int c = s.nextInt();

            if(m > c){
                mSum += 1;
            }else if(m < c){
                cSum += 1;
            }
            n--;
        }

        if(mSum > cSum){
            System.out.println("Mishka");
        }else if(mSum < cSum){
            System.out.println("Chris");
        }else{
            System.out.println("Friendship is magic!^^");
        }
       
        s.close();
    }
}
