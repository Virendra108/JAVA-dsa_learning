public class string_compression {
    public static String compression(String str){
        String newstr="";
        for(int i=0;i<str.length();i++){
            Integer count=1;                        //declared INTEGER object not int as we have to use .tostring() function which can be used only on object
            while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr+=str.charAt(i);
            if (count>1) {
                newstr+=count.toString();           //converted INTEGER object to string
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str="aaaabbbbcccvdfffdddd";          //Output :- a4b4c3vdf3d4
        System.out.println(compression(str));
    }
}
