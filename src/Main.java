import java.util.ArrayList;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        ArrayList<Integer> intList = new ArrayList<>();
        for (int i : intArray) {
            intList.add(i);
        }
        // Фильтрация и вывод только положительных чисел
        ArrayList<Integer> positiveFilteredList = new ArrayList<>();
        System.out.print("Отсортированные положительные числа: ");
        for (Integer integer : intList) {
            if (integer > 0) {
                positiveFilteredList.add(integer);
                System.out.print(integer + " ");
            }
        }
        System.out.println(" ");
        // Поиск четных чисел
        ArrayList<Integer> oddFilteredList = new ArrayList<>();
        System.out.print("Четные числа: ");
        for (Integer integer : positiveFilteredList) {
            if (integer % 2 == 0) {
                oddFilteredList.add(integer);
                System.out.print(integer + " ");
            }
        }
        System.out.println(" ");
        // Сортировка отфильтрованных чисел в порядке возрастания
        oddFilteredList.sort(Integer::compareTo);
        System.out.println("Отсортированные в порядке возрастания четные числа:" + oddFilteredList);

    }
}
