package ex_03_Type_Casting;

public class Lab0020_TypeCasting_examples {
    public static void main(String[] args) {

        int price = 200;

        float gst = 18.45f;

        int total = price + (int) gst;    // explicit Narrowing casting

        System.out.println(total);

        float money = price + gst;      // implicit widening

        float money2 = (float) price + gst;   // Explicit widening
        System.out.println(money2);
        System.out.println(money);

    }
}
