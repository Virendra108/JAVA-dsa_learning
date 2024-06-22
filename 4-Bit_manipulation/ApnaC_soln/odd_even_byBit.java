public class odd_even_byBit {
    public static void OddEven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String args[]){
        OddEven(5);
        OddEven(6);
        OddEven(8891);
        OddEven(0);
    }
}
