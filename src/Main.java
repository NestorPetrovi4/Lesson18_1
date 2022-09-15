import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
                "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
                "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        WordsChecker wordsChecker = new WordsChecker(text);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для проверки");
        String stringInput = scanner.nextLine();
        if (wordsChecker.hasWord(stringInput)) {
            System.out.println("Слово " + stringInput + " содержится в тексте");
        } else {
            System.out.println("Слово " + stringInput + " не содержится в тексте");
        }

    }
}
