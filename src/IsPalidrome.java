import java.util.Scanner;

public class IsPalidrome {
    public static boolean isPalidrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        int leftSide = 0;
        int rightSide= str.length() - 1;
        while (leftSide < rightSide) {
            if (str.charAt(leftSide) != str.charAt(rightSide)) {
                return false;
            }
            leftSide++;
            rightSide--;
        }
        return true;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядок для перевірки на паліндром:");
        String inputString = scanner.nextLine();

        boolean isPalindrome = isPalidrome(inputString);

        if (isPalindrome) {
            System.out.println("Рядок '" + inputString + "' є паліндромом.");
        } else {
            System.out.println("Рядок '" + inputString + "' не є паліндромом.");
        }

        scanner.close();
    }
}
