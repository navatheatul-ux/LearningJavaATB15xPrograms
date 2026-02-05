package ex_07_If_Conditions;

import java.util.Scanner;

public class Lab0041_Triangle_Classifier {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the side 1 of the triangle: ");
        double l1 = sc.nextDouble();

        System.out.println("Enter the length of the side 2 of the triangle: ");
        double l2 = sc.nextDouble();

        System.out.println("Enter the length of the side 3 of the triangle: ");
        double l3 = sc.nextDouble();

        if(l1==l2 && l2==l3)
        {
            System.out.println("The triangle is an equilateral triangle");
        }
        else if(l1==l2 || l2==l3 || l1==l3 )
        {

            System.out.println("The triangle is an isosceles triangle");
        }
        else
        {
            System.out.println("The triangle is an scalene triangle");
        }

    }
}
