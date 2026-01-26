package ex_02_Java_Basic;

public class Lab007_LocalVariable02 {

    public static void main(String[] args)
    {
        if (true)
        {
            int x = 111;   // This is a Local Variable declared within the if-block
            System.out.println(x);
        }

       // System.out.println(x);  // Here we can not access this local variable cause this is declared within the if-block and it only exists
    }
}
