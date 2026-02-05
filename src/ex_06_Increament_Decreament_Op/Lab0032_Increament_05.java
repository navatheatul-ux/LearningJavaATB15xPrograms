package ex_06_Increament_Decreament_Op;

public class Lab0032_Increament_05 {

    public static void main(String[] args)
    {
        int a = 40;

        int b = (++a + a++ + a--);

        System.out.println(a);
        System.out.println(b);

    }
}
