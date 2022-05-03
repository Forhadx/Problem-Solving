public class cf_1560A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int i = 1;
        while(arr.size() <= 1000){
            if(i%3 !=0 && i%10 != 3){
                arr.add(i);
            }
            i++;
        }

        int t = s.nextInt();

        while(t > 0){
            int k = s.nextInt();
            System.out.println(arr.get(k-1));
            
            t--;
        }

        s.close();
    }    
}
