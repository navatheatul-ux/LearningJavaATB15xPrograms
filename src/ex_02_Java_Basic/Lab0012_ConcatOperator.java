package ex_02_Java_Basic;

public class Lab0012_ConcatOperator {

    public static void main(String[] args)
    {
       int a = 10;
       int b = 10;

       System.out.println(a+b);    // Here + is used as arithmatic operator to perform mathematical operations on the operands for the integer values

        String s = "Atul";

        String s1 = "Navathe";

        System.out.println(s + s1);   // Here + is used to concatinate or join two different Strings

        System.out.println(s + s1 + a + b);   // here whenever it sees Stirng first it will do concatination and for the next integer it will also do concatination

        System.out.println(a + b + s + s1 );  // here it will do maths operation that adds two integers and then perform concatination

        System.out.println(s + s1 + (a + b));


    }
}
