//Создайте массив из двенадцати элементов с помощью генератора случайных чисел с элементами от –20 до 10 и выведите его на экран.
// Замените все отрицательные элементы массива числом 0.
public class NegativeZero {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 31) - 20;

        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                        array[i]=0;
            }
            System.out.print(array[i] + " ");
        }
    }
}

