//Создайте массив из семи элементов с помощью генератора случайных чисел и выведите его на экран. Увеличьте все его элементы в 2 раза.
import java.util.Arrays;

public class Elements_7 {

    public static void main(String[] args) {
        int[] array = new int[7];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 100-50);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        System.out.print(Arrays.toString(array));
    }
}
