import java.util.Scanner;

public class TaskWork4part2 {

    public static void main(String[] args) {

        //2. Формируется новогодний подарок.
        // Он может включать в себя разные сладости (Candy, Jellybean, etc.)
        // У каждой сладости есть название, вес, цена и свой уникальный параметр.
        String[][] presentsList = new String[][]
                {
                        {"Candy", "150", "200", "1"},
                        {"Jellybean", "100", "100", "2"},
                        {"Berty Bots", "400", "700", "3"},
                        {"Marshmallow", "50", "300", "4"},
                        {"Banana marmalade", "320", "500", "5"},
                        {"Choko-pie", "180", "400", "6"}
                };
        for (int i = 0; i < 6; i++) {
            System.out.println(" " + presentsList[i][3] + "\t" + presentsList[i][0]  + "\tцена: " + presentsList[i][2]+ "\t вес: " + presentsList[i][1]);
        }
        // Необходимо собрать подарок из сладостей.
        System.out.println("Выберите три вида сладостей и число порций:");
        String[] presentPack = new String[3];
        Scanner scanner = new Scanner(System.in);
        int chosenIndex, amount, sumWeight = 0, sumPrice = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("\tВведите число от 1 до 6 для выбора вида: ");
            chosenIndex = scanner.nextInt();
            presentPack[i] = presentsList[chosenIndex - 1][0];
            System.out.println(presentPack[i]);

            System.out.println("\tВведите число порций: ");
            amount = scanner.nextInt();
            sumWeight += amount * Integer.parseInt(presentsList[chosenIndex - 1][1]);
            sumPrice += amount * Integer.parseInt(presentsList[chosenIndex - 1][2]);
        }
        // Найти общий вес подарка,
        System.out.println(">Общий вес подарка: " + sumWeight + " г");
        // общую стоимость подарка и
        System.out.println(">Общая стоимость подарка: " + sumPrice + " руб.");
        // вывести на консоль информацию о всех сладостях в подарке.
        System.out.println(">Список сладостей в подарке: ");
        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + ". " + presentPack[i]);
        }

    }

}
