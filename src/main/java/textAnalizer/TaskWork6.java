package textAnalizer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class TaskWork6 {
    public static void main(String[] args) throws IOException {


        //Есть входной файл с набором слов, написанных через пробел
        Path path = Paths.get("src/main/java/textAnalizer/file.txt");
        //Прочитать слова из файла.
        List<String> lines = Files.readAllLines(path, UTF_8);
        ArrayList<String> words = new ArrayList<>();
        for (String line : lines) {
            String[] word = line.split(" ");
            for (String s : word)
                if (!s.equals("")) {
                    words.add(s);
                }
        }

        //Отсортировать в алфавитном порядке.
        //Collections.sort(words);
        words.sort(Comparator.naturalOrder());
                //Проблема! сортировка почему-то добавляет в конец первое слово списка
                //костыль:
        words.remove(words.size()-1);
        //Посчитать сколько раз каждое слово встречается в файле.
        Map<String, Integer> map = countWords(words);
        //Вывести статистику на консоль
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

        //Найти слово с максимальным количеством повторений.
        int maxCount = 0;
        String maxKey = "";
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() > maxCount) {
                maxCount = pair.getValue();
                maxKey = pair.getKey();
            }
        }
        //Вывести на консоль это слово и сколько раз оно встречается в файле
        System.out.println("Самое частое слово: " + maxKey + ", число повторений: " + maxCount);
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        TreeMap<String, Integer> result = new TreeMap<>();
        for (String s : list) {
            if (!result.containsKey(s)) {
                result.put(s, 1);
            }
            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            }
        }
        return result;
    }
}