// �������� ������ �� ������ ��������� � ������� ���������� ��������� ����� � ���������� �� �10 �� 10 � �������� ��� �� �����. ����������� ���������� ������������� ��������� �������.

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
            System.out.println("���������� ������������� ���������: " + count);
        }
    }

