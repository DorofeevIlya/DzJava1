// 4.** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или 
// отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. 
// Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 
// (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую
//  сторону сдвиг можете выбирать сами.

import java.util.Scanner;
import java.util.Arrays;
public class z4 {
    public static void shiftRight(int[] array, int value){
        for (int i = 0; i < value; i++) {
            int lastValue = array[array.length - 1];
            for (int j = array.length-1; j >= 1; j--) {
                array[j] = array[j-1];
            }
            array[0] = lastValue;
        }
    }
    public static void shiftLeft(int[] array, int value){
        for (int i = 0; i < value; i++) {
            int firstValue = array[0];
            for (int j = 1; j <= array.length-1; j++) {
                array[j-1] = array[j];
            }
            array[array.length-1] = firstValue;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int numbs[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            numbs[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.println("Введите необходимое число позиций для сдвига: ");
        int n = input.nextInt();
        System.out.println("Исходящий массив - " + Arrays.toString(numbs));
        input.close();
            if (n > 0) {
                shiftRight(numbs, n);
                System.out.println("После сдвига вправо на " + n + " новый массив - " + Arrays.toString(numbs));
            }
            else {
                int b = n*-1;
            shiftLeft(numbs, b);
                System.out.println("После сдвига влево на " + (b) + " новый массив - " + Arrays.toString(numbs));
            }

    }
}
// public class z4 {
    // public static void shiftToRight(int[] array, int value){
    //     for (int i = 0; i < value; i++) {
    //         int lastValue = array[array.length - 1];
    //         for (int j = array.length-1; j >= 1; j--) {
    //             array[j] = array[j-1];
    //         }
    //         array[0] = lastValue;
    //     }
    // }
//     public static voidshiftLeft(int[] array, int value){
//         for (int i = 0; i < value; i++) {
//             int firstValue = array[0];
//             for (int j = 1; j <= array.length-1; j++) {
//                 array[j-1] = array[j];
//             }
//             array[array.length-1] = firstValue;
//         }
//     }
//     public static void main(String[] args) {
//         int[] array = new int[]{ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//         int n = 3; // сдвиг
//         System.out.println("Входящий массив" + Arrays.toString(array));
//         shiftToRight(array, n);
//         System.out.println("Сдвинули вправо на " + n);
//         System.out.println("Исходящий массив" + Arrays.toString(array));
//        shiftLeft(array, n-1);
//         System.out.println("Сдвинули влево на " + (n - 1));
//         System.out.println("Исходящий массив" + Arrays.toString(array));
//     }
// }
