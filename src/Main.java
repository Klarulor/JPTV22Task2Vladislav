import java.util.Scanner;

import static java.lang.Integer.parseInt;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Посчитаю сумму цифр: ");
        String text = scanner.nextLine();
        int total = 0;
        for(int i = 0; i < text.length(); i++){
            total += parseInt(String.valueOf(text.toCharArray()[i]));
        }
        System.out.println("Total number is "+total);
    }
}