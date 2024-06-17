public class shortest_path {
    public static void main(String args[]){
        int x=0,y=0;                                    //initial coordinates of the point here it is origin
        String path="WNEENESENNN";                      //this is the path given by the user
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
        }
        int x2=x*x;                                  //x and y are the coordinates of the final point
        int y2=y*y;
        double distance=Math.sqrt(x2+y2);            //distance formula from origin
        System.out.println("Shortest distance is: "+distance);
    }
}
