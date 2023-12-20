// Создайте массив из пяти чисел и выведите их на экран в обратном порядке.

import java.util.InputMismatchException;
import java.util.Scanner;

public class ObratniiPoradok {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите 5 чисел массива через пробел");
            if (s.hasNextInt()) {
                int[] array = new int[5];
                for (int i = 0; i < 5; i++) {
                    array[i] = s.nextInt();
                }
                System.out.println("Числа в обратном порядке: ");
                for (int i = 4; i >= 0; i--) {

                    System.out.println(array[i] + " ");
                }
            } else System.out.println("Ошибка. Введено не число");
        } catch (InputMismatchException e){
            System.out.println("Ошибка ввода");
        }
    }
}
