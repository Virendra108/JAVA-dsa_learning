public class bit_basic{
  public static void main(string[] args){
    //BITWISE OPERATORS
    
    //Binary and  &
    //Binary or   |
    //Binary XOR  ^
    //ones complement  ~
    //left shift  <<
    //right shift  >>


    // AND & OPERATOR
    /*  
        A    B    R         
        0    0    0    let A=5  B=6    A= 0 1 0 1
        1    0    0                    B= 0 1 1 0
        0    1    0                    R= 0 1 0 0  ==> 4    so the answer is 4
        1    1    1 
    */
    System.out.println("5 & 6 = " + (5 & 6));  // Output is 4

    // OR | OPERATOR
    /*  
        A    B    R        
        0    0    0    let A=5  B=6    A= 0 1 0 1
        1    0    1                    B= 0 1 1 0
        0    1    1                    R= 0 1 1 1  ==> 7     so the answer is 7
        1    1    1 
    */
    System.out.println("5 | 6 = " + (5 | 6));  // Output is 7

    // XOR ^ OPERATOR
    /*  
        A    B    R        
        0    0    0    let A=5  B=6    A= 0 1 0 1
        1    0    1                    B= 0 1 1 0
        0    1    1                    R= 0 0 1 1  ==> 3     so the answer is 3
        1    1    0 
    */
    System.out.println("5 ^ 6 = " + (5 ^ 6));  // Output is 3

    // Ones complement ~ OPERATOR
    /*  
        let A=5           A = 0 1 0 1
                         ~A = 1 0 1 0  ==> -6             (in two's complement form)
    */
    System.out.println("~5 = " + (~5));  // Output is -6

    // Left shift << OPERATOR
    /*  
        let A=5           A = 0 1 0 1
                         A << 1 = 1 0 1 0  ==> 10         (shift all bits left by 1)
    */
    System.out.println("5 << 1 = " + (5 << 1));  // Output is 10

    // Right shift >> OPERATOR
    /*  
        let A=5           A = 0 1 0 1
                         A >> 1 = 0 0 1 0  ==> 2          (shift all bits right by 1)
    */
    System.out.println("5 >> 1 = " + (5 >> 1));  // Output is 2

    
    
  }
}
