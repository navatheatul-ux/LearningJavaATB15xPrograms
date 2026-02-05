package ex_06_Increament_Decreament_Op;

public class Lab0029_Increament_02 {

    public static void main(String[] args)
    {
        int a = 30;

        int b = (a++ + a);   // A =30, a =31  + B = 31, so b = 61

        System.out.println(a);
        System.out.println(b);

    }
}
