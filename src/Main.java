import java.util.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("Hello! Welcome to the Rock-Paper-Scissors game. Enjoy!");

        System.out.println("_____________________________________________________________________");

        System.out.println("Choose one: rock, paper, or scissors");

        List<String> choices = new ArrayList<>();

        choices.add("rock");
        choices.add("paper");
        choices.add("scissors");

        Random random = new Random();
        String randomListElement = choices.get(random.nextInt(choices.size()));

        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        if (!(Objects.equals(inputText, "rock") || Objects.equals(inputText, "paper") || Objects.equals(inputText, "scissors"))) {

            System.out.println("Please only choose rock, paper, or scissors.");
        }


        if (randomListElement.equals(inputText)) {
            System.out.println(randomListElement);
            System.out.println("It's a draw!");
        } else if (randomListElement.equals("rock") && inputText.equals("paper")) {
            System.out.println(randomListElement);
            System.out.println("you won!");
        } else if (randomListElement.equals("rock") && inputText.equals("scissors")) {
            System.out.println(randomListElement);
            System.out.println("the machine won!");
        } else if (randomListElement.equals("paper") && inputText.equals("rock")) {
            System.out.println(randomListElement);
            System.out.println("the machine won!");
        } else if (randomListElement.equals("paper") && inputText.equals("scissors")) {
            System.out.println(randomListElement);
            System.out.println("you won!");
        } else if (randomListElement.equals("scissors") && inputText.equals("rock")) {
            System.out.println(randomListElement);
            System.out.println("you won!");
        } else if (randomListElement.equals("scissors") && inputText.equals("paper")) {
            System.out.println(randomListElement);
            System.out.println("the machine won!");
        }
    }
}