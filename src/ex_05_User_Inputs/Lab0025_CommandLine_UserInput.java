package ex_05_User_Inputs;

public class Lab0025_CommandLine_UserInput {

    public static void main(String[] args)
    {
        String age = args[0];      // Taking inputs from the Command Line (Args)

        int user_age = Integer.parseInt(age);    // Here we use Integer.parseInt() function to convert String directly into Integer

        System.out.println(user_age);

        String result = user_age >18 ? "Eligible for Voting" : "Not Eligible for voting";

        System.out.println(result);



    }
}
