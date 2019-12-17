package Tasks;

import java.util.Scanner;

public class Task_17_12_2019 {
    public static void main (String[] args) {
        System.out.print("Введите номер");
        Scanner input1 = new Scanner(System.in);
        int birthdate = input1.nextInt();
        if (birthdate == 11) {
            for (int a = 0; a < 3; a++)
                System.out.println("Hello");
        }
        else {
            System.out.println("Не верно");
        }
    }
}
