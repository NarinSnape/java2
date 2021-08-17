package textAnalizer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

public class TaskWork6 {
    public static void main(String[] args) throws IOException {


        //Есть входной файл с набором слов, написанных через пробел
        Path path = Paths.get("src/main/java/textAnalizer/file.txt");
        File file = new File(String.valueOf(path));
        //проверки на существование файла и его содержание
        if (file.exists() && file.length() > 0) {
            //Прочитать слова из файла.
            Scanner scanner = new Scanner(file);
            ArrayList<String> words = new ArrayList<>();
            while (scanner.hasNext()) {
                words.add(scanner.next());
            }
            scanner.close();


            //Отсортировать в алфавитном порядке.
            Collections.sort(words);
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
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        TreeMap<String, Integer> result = new TreeMap<>();
        for (String s : list) {
            if (result.containsKey(s)) {
                result.put(s, result.get(s) + 1);
            }
            if (!result.containsKey(s)) {
                result.put(s, 1);
            }
        }
        return result;
    }
}