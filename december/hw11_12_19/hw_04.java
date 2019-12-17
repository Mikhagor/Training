package december.hw11_12_19;

import java.util.Scanner; // подключаем сканер

public class hw_04 {
    public static void main(String[] args) {
        System.out.print("Введите номер дома: ");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i == 8) {
            for (int a = 0; a < 2; a++)
            System.out.println("Верный номер дома");
        } else {
            System.out.println("Вы ввели не верный номер своего дома");
        }

        System.out.print("Введите номер квартиры: ");
        Scanner input2 = new Scanner(System.in);
        int i2 = input2.nextInt();
        if (i2 == 324) {

            System.out.println("Верный номер квартиры");
        } else {
            for (int a = 0; a < 9; a++)
            System.out.println("Не верный номер квартиры");
        }
    }
}


