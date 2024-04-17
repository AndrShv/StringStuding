import java.util.Scanner;

public class WordsPossitionFinder {
    public static int findPossition(String sentence, String target) {
        int index = sentence.indexOf(target);
        return index;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть речення:");
        String sentence = scanner.nextLine();

        System.out.println("Введіть слово для пошуку:");
        String target = scanner.nextLine();

        int position = findPossition(sentence, target);

        if (position != -1) {
            System.out.println("Слово '" + target + "' знаходиться на позиції " + position + " у реченні.");
        } else {
            System.out.println("Слово '" + target + "' не знайдено у реченні.");
        }

        scanner.close();
    }
}
