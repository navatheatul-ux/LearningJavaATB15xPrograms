package ex_03_Type_Casting;

public class Lab0019_NarrowCasting_01 {
    public static void main(String[] args)
    {
        long phone = 9876544442L;

//      short s = phone;     // Implicit narrowing is not possible

        short s1 = (short) phone;
        System.out.println(s1);

    }
}
