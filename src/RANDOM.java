import java.util.Scanner;

public class RANDOM {
    public static void main(String [] ranndom){

        boolean program = true;
        Scanner userResponse;
        userResponse = new Scanner(System.in);
        String person;
        String blank;
        int personIngredients;
        int personDays;
        float cups;
        float cupPrice;
        float unit;
        float amount;
        float totalOne;
        float totalTwo;
        float total;
        float totalThree;

        System.out.println("WELCOME TO THE PROGRAM!");
        System.out.println("How many supply objects do you have to input?");
        personIngredients = userResponse.nextInt();
        while (program) {
            for (int i = 0; i < personIngredients; i++) {
                System.out.println("Name of ingredient: ");
                blank = userResponse.nextLine();
                person = userResponse.nextLine();
                System.out.println("Price per unit of ingredient:");
                unit = userResponse.nextFloat();
                System.out.println("Amount bought of item:");
                amount = userResponse.nextFloat();
                totalOne = unit * amount;
                System.out.println(totalOne);
            }
                System.out.println("How many days did you sell for?");
                personDays = userResponse.nextInt();
                for (int q = 0; q < personDays; q++) {
                    System.out.println("How many cups did you sell on day:" + q);
                    cups = userResponse.nextFloat();
                    System.out.println("How much did you sell each cup for?");
                    cupPrice = userResponse.nextFloat();
                    totalTwo = cups * cupPrice;
                    totalTwo = totalTwo + totalTwo;
                    System.out.println(totalTwo);
                }
        }
    }
}
