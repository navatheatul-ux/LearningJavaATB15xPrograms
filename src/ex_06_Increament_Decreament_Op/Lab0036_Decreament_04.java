package ex_06_Increament_Decreament_Op;

public class Lab0036_Decreament_04 {

    public static void main(String[] args)
    {

//        int a = 20;
//
//        int b = --a + a-- - a++ + a--;     //19 + 19 - 18 + 19
//
//        System.out.println(a);  // 18
//        System.out.println(b);  // 39

        int a = 10;

        a = a++ + a++ + a++;
        System.out.println(a);

//        int c = 3;
//
//        int d = c++ * ++c;
//        System.out.println(c);
//        System.out.println(d);

        int c = 5;

        System.out.println(c++ + c--);  // 5 + 6


    }
}
