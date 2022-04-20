// 2011. Final Value of Variable After Performing Operations

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String str: operations){
            if(str.equals("++X") || str.equals("X++")){
                x += 1;
            }else{
                x -= 1;
            }
        }
        
        return x;
    }
}

public class l_2011 {
    public static void main(String[] args) {
        
    }
}
