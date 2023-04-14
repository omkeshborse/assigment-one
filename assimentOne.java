
public class assimentOne {
    public static void main(String[] args) {
        /*
         * assignment Questions
         * 
         * Q1 - Take 2 integer values in two variables x and y and print their product.
         * (Easy)
         * Sample Input : x=2, y=4 (Both integers)
         * Sample Output : 8
         */
        int a = 2;
        int b = 4;
        System.out.println(a * b);

        /*
         * Print the ASCII value of character ‘U’. (Easy)
         * Sample Input : already mentioned as ‘U’
         * Sample Output : 85
         */
        char u = 'U';
        int ascii = u;
        System.out.println("ASCII of " + u + "  " + "is " + "  " + ascii);

        /*
         * Write a Java program to take the length and breadth of a rectangle and print
         * its area. (Easy)
         * Sample Input : 7, 4
         * Sample Output : 28
         */

         int length =  7 ;
         int breadth = 4 ;

         System.out.println( "area of rectangle is :" + length*breadth);


         /* Q5 - Write a Java program to swap two numbers with the help of a third variable.
          * Sample Input : 2,3
          Sample Output : 3,2
          */

        int num1 = 2 ;
        int num2 = 3 ; 

        int thirdVar ;

        thirdVar = num1 ;
        num1 = num2 ;

        num2 = thirdVar ;
        System.out.println("swape:"+ num1 +"  " +num2);
    }      

}
