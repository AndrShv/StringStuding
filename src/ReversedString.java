import java.util.Scanner;

public class ReversedString {
    public static String makeStringReversed(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
        return reversed;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядок:");
        String originalString = scanner.nextLine();

        String reversedString = makeStringReversed(originalString);

        System.out.println("Обернений рядок: " + reversedString);

        scanner.close();
    }
}
