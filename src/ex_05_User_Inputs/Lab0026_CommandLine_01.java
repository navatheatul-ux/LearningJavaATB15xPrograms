package ex_05_User_Inputs;

public class Lab0026_CommandLine_01 {

    public static void main(String[] args)
    {
//        String a = args[0];
//        String b = args[1];
//        String c = args[2];

        int a1 = Integer.parseInt(args[0]);
        int b1 = Integer.parseInt(args[1]);
        int c1 = Integer.parseInt(args[2]);

        String result = a1 >b1 ? "a1 is greater" : (b1 > c1 ? "b1 is greater" : "c1 is greater");

        System.out.println(result);

    }
}
