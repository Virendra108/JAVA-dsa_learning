public class palindrome {
    public static void main(String args[]){
        String name="madam";
        int len=name.length();
        int flag=0;
        for(int i=0;i<len/2;i++){
            if(name.charAt(i)!=name.charAt(len-i-1)){
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Not a palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
    }
    
}
