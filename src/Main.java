import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Insert a binary number up to 10 digits.");
        String input = read.nextLine();

        int result = 0;

        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == '1'){
                result += (int) Math.pow(2, (input.length() - 1) - i);
            }
        }

        System.out.println("Your number is: " + result);
    }
}