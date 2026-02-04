package ex_02_Java_Basic;

public class Lab0011_LogicalOperators {

    public static void main(String[] args)
    {
        boolean a = true;
        boolean b = false;

        boolean c = a && b;
        System.out.println(c);

        boolean d = a || b;
        System.out.println(d);

        System.out.println(!a);

        System.out.println(!!b);
    }

}
