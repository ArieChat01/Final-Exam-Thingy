import java.util.Scanner;

public class RANDOM {
    public static void main(String [] ranndom){

        boolean program = true;
        boolean again = true;
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
        float profit;

        System.out.println("WELCOME TO THE PROGRAM!");

        while (program) {
            float total = 0;
            float totalPartTwo = 0;

            System.out.println("How many supply objects do you have to input?");
            personIngredients = userResponse.nextInt();

            for (int i = 0; i < personIngredients; i++) {
                System.out.println("Name of ingredient: ");
                blank = userResponse.nextLine();
                person = userResponse.nextLine();
                System.out.println("Price per unit of item:");
                unit = userResponse.nextFloat();
                System.out.println("Amount bought of item:");
                amount = userResponse.nextFloat();
                totalOne = unit * amount;
                System.out.println("Price for " + person +": $" + totalOne);
                total   += totalOne;
            }
            System.out.println("Total: $" + total);

            int days = 0;
                System.out.println("How many days did you sell for?");
                personDays = userResponse.nextInt();
                for (int q = 0; q < personDays; q++) {
                    days ++;
                    System.out.println("How many cups did you sell on day: " + days);
                    cups = userResponse.nextFloat();
                    System.out.println("How much did you sell each cup for?");
                    cupPrice = userResponse.nextFloat();
                    totalTwo = cups * cupPrice;
                    System.out.println("Price: $" + totalTwo);
                    totalPartTwo += totalTwo;
                }
                System.out.println("Total: $" + totalPartTwo);
                profit = totalPartTwo - total;
                System.out.println("YOUR PROFIT IS...");
                System.out.println("$" + profit);
                while(again){
                    System.out.println("Would you like to run the program again? Y/N");
                    blank = userResponse.nextLine();
                    person = userResponse.nextLine().toLowerCase();
                    if(person.equals("y")){
                        again = false;
                    }
                    if (person.equals("n")){
                        program = false;
                        again = false;
                    }
                    else if(!person.equals("y") && !person.equals("n")){
                        System.out.println("PLEASE ANSWER THE QUESTION.");
                        again = true;
                        System.out.println(blank);
                    }
                }

        }
    }
}
