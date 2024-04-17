import java.util.Scanner;

public class SymbolQuantityFinder {
    public static int findSymbolCount(String text, char symbol) {
        int quantity = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                quantity++;
            }
        }
        return quantity;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        System.out.println("Введіть символ:");
        char symbol = scanner.next().charAt(0); // читаємо перший символ з введеного рядка

        int occurrence = findSymbolCount(text, symbol);

        System.out.println("Кількість входжень символу '" + symbol + "' в тексті: " + occurrence);

        scanner.close();
    }
}
