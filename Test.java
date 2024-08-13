import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(Main.hello());  //1 задача

        System.out.println("Введите число для вычисления факториала: ");  //2 задача
        int number = in.nextInt();
        in.nextLine();
        System.out.println("Факториал числа равен: " + Main.factorial(number));

        System.out.println("Введите текст для подсчета в нем слов: ");   //3 задача
        String str = in.nextLine();
        System.out.println("Количество слов в нем: " + Main.word(str));

        System.out.println("Введите текст: ");   //4 задача
        String sentence = in.nextLine();
        System.out.println("Ваш текст наоборот: " + Main.reverseSentence(sentence));

        ArrayList<Integer> numbersList1 = new ArrayList<>();  //5 задача
        System.out.println("Введите числа через пробел: ");
        String string = in.nextLine();
        String[] strArray1 = string.split("\\s+");
        for (int i = 0; i < strArray1.length; i++) {
            int number2 = Integer.parseInt(strArray1[i]);
            numbersList1.add(number2);
        }
        System.out.println("Максимальный элемент: " + Main.maxNumber1(numbersList1));

        LinkedList<Integer> numbersList2 = new LinkedList<>();
        System.out.println("Введите числа через пробел:");
        String string2 = in.nextLine();
        String[] strArray2 = string2.split("\\s+");
        for (int i = 0; i < strArray2.length; i++) {
            int number3 = Integer.parseInt(strArray2[i]);
            numbersList2.add(number3);
        }
        System.out.println("Максимальный элемент: " + Main.maxNumber2(numbersList2));

        List<String> words = Arrays.asList("qollab", "erg", "erg", "qollab", "erg", "bts"); //6 задача
        Map<String, Integer> wordCount = Main.countWords(words);

        System.out.println("Число слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}




