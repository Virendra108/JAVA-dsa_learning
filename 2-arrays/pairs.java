public class pairs {
    public static void pair(int numbers[]) {
        int count=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")" ); //used direct method withhout declaring extra variable for storing i and rewritting it in j loop
                count++;                                             //modified this to get number of pairs

            }
        System.out.println("");    
        }
        System.out.println("total number of pairs "+count);     //printed that number at last
        
    }
    public static void main(String[] args) {
        int[] numbers={2,4,6,8,10};
        pair(numbers);
    }
    
}
