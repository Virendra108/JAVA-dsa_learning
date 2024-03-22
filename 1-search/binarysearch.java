public class binarysearch {
    public static int search(int numbers[],int key) {
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;    //when return statement is written means it already breaks loop so no need to write break after that it will sho unrechable statement error
            }
            else if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6};
        int key=30;
        System.out.println("location is  "+search(numbers,key));                   //required code without any modification
       /*  if(search(numbers,key)!=-1){
            System.out.println("key is present at  "+search(numbers,key));         //more good modified code for exact answer
        }
        else{
            System.out.println("key not exist");
        }*/
    }
}
