package ex_02_Java_Basic;

public class Lab006_LocalVariable {

    public static void main(String[] args)
    {
        int x = 10;    // This is a local variable declared inside the "main()" method.

        if (true)
        {
            System.out.println(x);   // So we can access that Local variable here in if block, which is declared in the main() method.
        }
    }
}
