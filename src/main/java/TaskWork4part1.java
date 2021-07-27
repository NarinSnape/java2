public class TaskWork4part1 {

    public static void main(String[] args) {
        //Массив размерностью 20, заполняется случайными целыми числами от -10 до 10.
        int[] randomArray = new int[20];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) getRandomIntegerBetweenRange(-10, 10);
            System.out.print(randomArray[i] + " ");
        }
        // Найти максимальный отрицательный и минимальный положительный элементы массива.
        int max, min, maxIndex, minIndex;
        max = -100;
        min = 100;
        maxIndex = minIndex = 0;
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] > max && randomArray[i] < 0) {
                max = randomArray[i];
                maxIndex = i;
            }
            if (randomArray[i] < min && randomArray[i] > 0) {
                min = randomArray[i];
                minIndex = i;
            }
        }
        System.out.println("\n----------------\nmaxMinus = " + max + "; minPlus = " + min);
        // Поменять их местами.
        int stack = randomArray[maxIndex];
        randomArray[maxIndex] = randomArray[minIndex];
        randomArray[minIndex] = stack;
        for (int value : randomArray) {
            System.out.print(value + " ");
        }
    }

    //метод для рандомизации в заданном диапазоне
    public static double getRandomIntegerBetweenRange(double min, double max) {
        double x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }
}
