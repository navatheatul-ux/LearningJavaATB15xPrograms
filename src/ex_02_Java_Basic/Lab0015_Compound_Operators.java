package ex_02_Java_Basic;

public class Lab0015_Compound_Operators {

    public static void main(String[] args)
    {
        int age = 20;

        age += 20;   // This means age = age +20

        age -= 10;

        age *= 5;

        age /= 2;

        age %= 4;

        System.out.println(age);


        String name = "Atul";

        int a = 10;
        System.out.println(name instanceof String);   // This is instanceof operator we used here, give result in the form of boolean True & False

    }
}
