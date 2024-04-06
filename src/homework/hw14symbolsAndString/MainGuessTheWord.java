package homework.hw14symbolsAndString;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.min;

class MainGuessTheWord {

    public static void main(String[] args) {
        MainGuessTheWord mainGuessTheWord = new MainGuessTheWord();
        String secretWord = mainGuessTheWord.secretWord(mainGuessTheWord.words);
        mainGuessTheWord.tryToGuessWord(secretWord);
    }


    private String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    private String secretWord(String[] strings) {
        Random random = new Random();
        return strings[random.nextInt(strings.length)];
    }

    private void tryToGuessWord(String secretWord) {
        Scanner scanner = new Scanner(System.in);
        char[] suggestionWord = new char[15];
        boolean isCorrectSecretWord = false;

        while (!isCorrectSecretWord) {
            System.out.println("Enter secret word:");
            String nextWord = scanner.nextLine().toLowerCase();

            if (!nextWord.equals(secretWord)) {
                int minWordLength = min(nextWord.length(), secretWord.length());
                Arrays.fill(suggestionWord, '#');

                for (int i = 0; i < minWordLength; i++) {
                    if (nextWord.charAt(i) == secretWord.charAt(i)) {
                        suggestionWord[i] = nextWord.charAt(i);
                    }
                }

                StringBuilder joinSuggestionWord = new StringBuilder();
                for (char symbol : suggestionWord) {
                    joinSuggestionWord.append(symbol);
                }
                System.out.println(joinSuggestionWord);
            } else {
                isCorrectSecretWord = true;
                System.out.println("You win");
            }
        }
    }
}
