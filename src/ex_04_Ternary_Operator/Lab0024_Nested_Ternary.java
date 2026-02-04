package ex_04_Ternary_Operator;

public class Lab0024_Nested_Ternary {

    public static void main(String[] args)
    {
        int a = 2;
        int b = 4;
        int c = 23;

        System.out.println("The greater number from the above is:");

        String result = a > b ? "a is greater" : (b>c ? "b is greater" : " c is greater");
        System.out.println(result);

    }
}
