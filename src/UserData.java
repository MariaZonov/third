// в методе main создайте массив объектов класса User с произвольными данными и
// с помощью цикла выведите на экран строки формата: УLast name:  <lastName>, name: <firstName> - <age>Ф.
public class UserData
{
    public static void main (String[] args)
    {
        User[] arr;
        arr = new User[5];
        arr[0] = new User("Maria","Vareshkina", 30);
        arr[1] = new User("Olga","Litvinova", 28);
        arr[2] = new User("Alex","Kwon", 37);
        arr[3] = new User("Oleg","Litvinov", 46);
        arr[4] = new User("Anna","Cibko", 32);


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Last name: " +arr[i].lastName + ", name: " + arr[i].firstName +" - "+ arr[i].age);

        }
    }
}
