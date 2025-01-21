////Lab v1 code
//package com.ontariotechu.sofe3980U;
//
///**
// * Hello world!
// *
// */
//public class App
//{
//    /**
//     * Main program: The entry point of the program. It creates two binary variables, adds them and print the result.
//     *
//     * @param args: not used
//     */
//    public static void main( String[] args )
//    {
//        Binary binary1=new Binary("00010001000");
//        System.out.println( "First binary number is "+binary1.getValue());
//        Binary binary2=new Binary("111000");
//        System.out.println( "Second binary number is "+binary2.getValue());
//        Binary sum= Binary.add(binary1,binary2);
//        System.out.println( "Their summation is "+sum.getValue());
//    }
//}



//Lab v2 code
package com.ontariotechu.sofe3980U;

import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App
{
    /**
     * Main program:  The entry point of the program. The local time will be printed first,
     *      Then it will create two binary variables, add them and print the result.
     *
     * @param args: not used
     */
    public static void main( String[] args )
    {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        Binary binary1=new Binary("00010001000");
        System.out.println( "First binary number is "+binary1.getValue());
        Binary binary2=new Binary("111000");
        System.out.println( "Second binary number is "+binary2.getValue());
        Binary sum= Binary.add(binary1,binary2);
        System.out.println( "Their summation is "+sum.getValue());

        //new code added by Rivka Sagi, student #100780926
        System.out.println("\n(new part of code)");
        Binary or=Binary.OR(binary1, binary2);
        System.out.println("Logical OR on the numbers gives " + or.getValue());
        Binary and=Binary.AND(binary1, binary2);
        System.out.println("Logical AND on the numbers gives " + and.getValue());
        Binary product=Binary.multiply(binary1, binary2);
        System.out.println("The product of the two numbers is " + product.getValue());
    }
}