// Создайте массив из восьми элементов с помощью генератора случайных чисел с элементами от –10 до 10 и выведите его на экран. Подсчитайте количество отрицательных элементов массива.

public class Elements_8 {

    public static void main(String[] args){
        int[] array = new int[8];
        int count = 0;
        for(int i=0;i<array.length;i++){
            array [i]=(int)(Math.random()*21)-10;
        }

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    count++;
                }
            }
        System.out.println(" ");
            System.out.println("Количество отрицательных элементов: " + count);
        }
    }

