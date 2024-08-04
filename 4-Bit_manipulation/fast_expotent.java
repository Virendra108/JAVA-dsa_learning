import java.util.*;
public class fast_expotent {
    public static int Innerfast_expotent(int a,int n) {
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans * a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Innerfast_expotent(5,3));
        System.out.println(Innerfast_expotent(9, 101));
        System.out.println(Innerfast_expotent(12, 10));
    }
}
