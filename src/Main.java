import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int result = 0;
        String input;

        do {
            System.out.println("Insert a binary number.");
            input = read.nextLine();
        } while (!isBinaryNumber(input));

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                result += (int) Math.pow(2, (input.length() - 1) - i);
            }
        }

        System.out.println("Your number is: " + result);
    }

    public static boolean isBinaryNumber(String input) {
        for (int i = 0; i < input.length(); i++) {
            int x = input.charAt(i);
            if (x != '0' && x != '1') {
                System.out.println("Input is not a binary number.");
                return false;
            }
        }
        return true;
    }
}