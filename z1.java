//1. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
import java.util.Scanner;
import java.util.Arrays;

public class z1 {
   
    public static int[] InArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt(); 
        int numbs[] = new int[size]; 
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            numbs[i] = input.nextInt(); //
        }
        input.close();
        return numbs;
    }

    public static int minValue(int[] arr) {
        int minVal = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < minVal) minVal = j;
        }
        return minVal;
    }
    public static int maxValue(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > maxVal) maxVal = j;
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] numbs = InArray();
        System.out.println(Arrays.toString(numbs));
        System.out.println(
                    "\nМинимальное значение = " + minValue(numbs) +
                        "\nМаксимальное значение = " + maxValue(numbs)
        );
    }
}