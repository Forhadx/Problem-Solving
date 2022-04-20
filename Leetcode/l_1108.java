// 1108. Defanging an IP Address

class Solution {
    public String defangIPaddr(String address) {
        String updateAddress = "";
        char[] chArr = address.toCharArray();

        for(char c: chArr){
            if(c == '.'){
                updateAddress += "[.]";
            }else{
                updateAddress += c; 
            }
        }
        return updateAddress;
    }
}


public class l_1108 {
    public static void main(String[] args) {
        String str = "1.1.1.1"; 

        Solution obj = new Solution();

       String x =  obj.defangIPaddr(str);  // 1[.]1[.]1[.]1
        System.out.println(x);
    }
}
