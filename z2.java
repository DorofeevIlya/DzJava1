// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью 
// цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
// Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, 
// то есть [0][0], [1][1], [2][2], …, [n][n];
import java.util.Scanner;

public class z2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Количество строк и столбцов массива: ");
        int x = input.nextInt();
        int [][] numbs = new int[x][x];
        for (int i = 0; i<x; i++) {
            for (int j = 0; j<x; j++){
                if (x-i==j+1 || i==j){
                    numbs [i][j] = 1;
                    System.out.print(" " + numbs[i][j] + " ");
                }
                else {
                    System.out.print(" " + numbs[i][j] + " ");
                }
            }  
            System.out.println(); 
        }  
            input.close();
    }
        
}