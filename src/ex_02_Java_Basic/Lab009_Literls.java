package ex_02_Java_Basic;

public class Lab009_Literls {

    public static void main(String[] args)
    {
        int s = 200;  // 200 is the interger literal

        float f = 2.8f;      // This is a float literal
        double d = 3.14;     // This is double literal

        char c = 'A';     // This is character literal

        char c2 = '$';    // Char type can also accept the special symbols

        char nl = '\n';   // Char literals also accept the "Escape sequence characters
        char tb = '\t';
        char bs = '\b';
        char c1 = '\r';

        System.out.println("AtulNavathe");

        System.out.println("Atul" +nl+ "Navathe");
        System.out.println("Atul" +tb+ "Navathe");
        System.out.println("Atul" +bs+ "Navathe");
        System.out.println("Atul" +c1+ "Navathe");

    }
}
