package ex_03_Type_Casting;

public class Lab0017_WideningCasting {

    public static void main(String[] args)
    {
        byte b = 10;

        int c = b;      // This is type casting - Widening Casting - Here we are converting smaller data type into the larger datatype - Implicit Casting

        System.out.println(c);  // Converted Byte --> Int - Implicit Widening (Internally done by the JVM Or Java compiler)

        int c1 = (int) b;   // explicit widening (Externally we have to do it manually)

        System.out.println(c1);
    }
}
