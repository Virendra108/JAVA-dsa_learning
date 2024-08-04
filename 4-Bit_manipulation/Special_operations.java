public class Special_operations {
    //GET I TH BIT
    public static int ith_bit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }

    //SET I TH BIT                    in this just make ith bit as 1 if it is already then dont do anythiing 
    public static int set_ithBit(int n,int i){
        int bitmask=1<<i;
        return (n | bitmask);
    }
    
    //CLEAR I TH BIT
    public static int clear_ithBit(int n,int i){
        int bitmask= ~(1<<i);          //as we want o at that loaction not 1 and 1 at remaining locations to do and
        return (n & bitmask);
    }

    //UPADATE I TH BIT    jus use above 2 functions
    public static int update_ithBit(int n, int i, int newBit){
        if(newBit==0){
            return clear_ithBit(n, i);
        }else{
            return set_ithBit(n, i);
        }
    }

    //CLEAR last I BITS
    public static int clear_iBits(int n,int i){
        int bitmask= -1<<i;      // required is 11111111...1000  sot the first are sign bits so negative and 
                                 // value should start from 1 no extra so taken -1 tha is ~0
        return(n & bitmask);
    }

    //CLEAR range of bits
    public static int clear_rangebits(int n,int i,int j){
        int a=(~0)<<j+1;
        int b=(1<<i)-1;
        int bitmask= a|b;
        return(n & bitmask);
    }
    public static void main(String[] args) {
        //GET
        System.out.println(ith_bit(5, 0)); //0101   1 at 0th  location
        System.out.println(ith_bit(5, 1)); //0101   0 at 1 st loaction
        System.out.println(ith_bit(1, 0)); //0001   1 at 0 st loaction

        //SET
        System.out.println(set_ithBit(10, 2)); //1010  1 at 2nd loc==> 1110 == 14 is answer

        //CLEAR
        System.out.println(clear_ithBit(10, 1)); //1010 clear at 1st loc==> 1000 == 8 is answer

        //UPDATE

        System.out.println(update_ithBit(10, 2, 1)); //1010 update 1 at 2nd location  == 14
        System.out.println(update_ithBit(10, 1, 0)); //1010 update 0 at 1st location  == 8


        //CLEAR I bits
        System.out.println(clear_iBits(15, 2));  //1111 i=2  last 2 bits ==> 1100 == 12

        //CLEAR range of bits
        System.out.println(clear_rangebits(10, 2, 4));

    }
    
}
