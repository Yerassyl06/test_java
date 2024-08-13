import java.util.*;

class Main {
    public static String hello() {
        return "Hello, world!";
    }

    public static int factorial(int number) {
        int counter = 1;
        if (number > -1) {
            for (int i = 1; i < number + 1; i++) {
                counter *= i;
            }
        }
        else {
            throw new IllegalArgumentException("Факториал не может быть отрицательным числом");
        }
        return counter;
    }

    public static int word(String sentence) {
        String[] sentenceArray = sentence.trim().split("\\s+");
        return sentenceArray.length;
    }

    public static StringBuilder reverseSentence(String str) {
        StringBuilder input = new StringBuilder();
        input.append(str);
        input.reverse();
        return input;
    }

    public static int maxNumber1(ArrayList<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не может быть пуцстым");
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static int maxNumber2(LinkedList<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Список не может быть пуцстым");
        }

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                wordCountMap.put(word, wordCountMap.get(word) + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        return wordCountMap;
    }
}
