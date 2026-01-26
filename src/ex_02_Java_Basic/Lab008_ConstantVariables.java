package ex_02_Java_Basic;

public class Lab008_ConstantVariables {

    public static void main(String[] args)
    {
        int s = 23, b = 45, c = 3222;

        s = 3434;
        System.out.println(s);

       final float PI = 3.14f;  //This is a constant variable declared using the "final" keyword, so that the asigned value can not be changed

       // PI= 2.14f;
        System.out.println(PI);

        byte _ = 123;

        short $ = 1273;

      //  System.out.println(_);   Not allowed to print for the variable _ (Underscore)
    }
}
