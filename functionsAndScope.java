import java.util.Scanner;

/**
 * Created by Jason on 6/21/2016.
 */
public class functionsAndScope {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        parameterCount("hi", "bye");
        stringLength("hello world");
        longestString("Apple", "Samsung");

        System.out.println("For the Alliance or the Horde?");
        userInput();

        System.out.println("I won't stop until you type: quit");
        typeQuit();

    }

    public static void parameterCount(String... numParameter) {
        System.out.println(numParameter.length);
    }

    public static void stringLength(String x) {
        System.out.println(x.length());
    }

    public static void longestString(String a, String b) {
        if (a.length() > b.length()) {
            System.out.println(a);
        } else System.out.println(b);
    }

    public static void userInput() {
        String userString = input.nextLine();
        if (userString.contains("Alliance")) {
            System.out.println("For the Alliance!");
        } else if (userString.contains("Horde")) {
            System.out.println("For the Horde");
        } else System.out.println("Sorry that's not a valid input");
    }

    public static void typeQuit() {
        String userString = input.nextLine();
        if (!userString.contains("quit")) {
            typeQuit();
        }
    }

}
