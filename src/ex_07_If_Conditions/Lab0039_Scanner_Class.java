package ex_07_If_Conditions;

import java.util.Scanner;

public class Lab0039_Scanner_Class {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        if(age > 60)
        {
            System.out.println("You need to do some exercise");
        }
        else
        {
            System.out.println("You have to be very fit ");
        }
    }
}
