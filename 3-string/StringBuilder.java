public class StringBuilder {
    public static void main(String args[]){
        //String are immutable
        //String builder is mutable
        //String builder is faster than string
        //String builder is not thread safe
        //String buffer is thread safe
        //String buffer is slower than string builder
        //String buffer is thread safe
        //String buffer is used in multi

        //when we have to modify a string in loop of TC O(n) the actual TC is O(n^2) because string is immutable 
        //as it will create a new string every time we modify it
        //so we use string builder in such cases

        //after completion of the loop we can convert the string builder to string by using toString() function

        StringBuilder sb=new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);                         //String builder have same functions as string and append is only availab
                                                //as String is immutable, so it does not have an append() method.
        }
        System.out.println(sb); //this will also print the string builder object
        String sa=sb.toString();  //this will convert the string builder object to string object 
        //REMINER: SB IS STILL A STRING BUILDER OBJECT AND HAVE TO CREATE A NEW STRING OBJECT TO CONVERT IT TO STRING
        System.out.println(sb); 
        System.out.println(sb.getClass().getName());   //String builder
        System.out.println(sa.getClass().getName());   //String
    }
}
