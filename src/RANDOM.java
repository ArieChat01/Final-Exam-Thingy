import java.util.Scanner;

public class RANDOM {
    public static void main(String [] ranndom){
        String ingredients;
        String cups;
        String days;
        boolean program = true;
        Scanner userResponse;
        userResponse = new Scanner(System.in);
        String person;
        int personIngredients;
        int unit;
        int amount;
        int totalOne;

        System.out.println("WELCOME TO THE PROGRAM!");
        System.out.println("How many supply objects do you have to input?");
        personIngredients = userResponse.nextInt();
        for(int i = 0; i == personIngredients; i++){
            System.out.println("Name of ingredient: ");
            person = userResponse.nextLine();
            System.out.println("Price per unit of ingredient:");
            unit = userResponse.nextInt();
            System.out.println("Amount bought of item:");
            amount = userResponse.nextInt();


        }
    }
}
