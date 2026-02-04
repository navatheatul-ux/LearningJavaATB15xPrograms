package ex_03_Type_Casting;

public class Lab0021_ExtraExample_Casting {

    public static void main(String[] args)
    {
        char ch = 'A';

        int a = ch;      // Widening implicit

        System.out.println(a);

        int b = 90;

        char ch1 = (char) b;
        System.out.println(ch1);
    }
}
