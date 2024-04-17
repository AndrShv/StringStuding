import java.util.Random;
import java.util.Scanner;

public class RandomWordInArray {
    private String hiddenWord;
    private String guessedWord;

    public void playGame() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
                "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        hiddenWord = words[random.nextInt(words.length)];
        guessedWord = "-".repeat(hiddenWord.length());

        System.out.println("Комп'ютер загадав слово. Спробуйте відгадати!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введіть слово:");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals(hiddenWord)) {
                System.out.println("Вітаємо! Ви правильно відгадали слово: " + hiddenWord);
                break;
            } else {
                StringBuilder hint = new StringBuilder();


                for (int i = 0; i < hiddenWord.length(); i++) {
                    if (userInput.length() > i && userInput.charAt(i) == hiddenWord.charAt(i)) {
                        hint.append(hiddenWord.charAt(i));
                    } else {
                        hint.append(guessedWord.charAt(i));
                    }
                }

                System.out.println("Ви не вгадали. Правильні літери: " + hint.toString());
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        RandomWordInArray game = new RandomWordInArray();
        game.playGame();
    }
}

