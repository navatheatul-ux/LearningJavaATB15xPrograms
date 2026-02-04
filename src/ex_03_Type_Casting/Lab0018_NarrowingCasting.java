package ex_03_Type_Casting;

public class Lab0018_NarrowingCasting {
    public static void main(String[] args)
    {

        int a = 300;

//        byte b = a;     // This is Implicit Narrowing - which is not possible in Java

        byte b1 = (byte) a;  // This is explicit narrowing -  converting large data type into smaller one - mannully done

        System.out.println(b1);
    }
}
