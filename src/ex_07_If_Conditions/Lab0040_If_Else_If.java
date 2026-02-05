package ex_07_If_Conditions;

import java.util.Scanner;

public class Lab0040_If_Else_If {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age > 60)
        {
            System.out.println("You are a aged");
        }
        else if (age > 18)
        {
            System.out.println("You are an adult");
        }
        else
        {
            System.out.println("You are an child / Minor");
        }

    }
}
