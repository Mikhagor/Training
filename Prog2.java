import java.util.Locale;
import java.util.Scanner;
public class Prog2
{
    public static void main (String [] args)

    {
        Scanner scanner = new Scanner (System.in);
        Double  number = scanner.nextDouble();
        Double  number2 = scanner.nextDouble();
        Double  square = number + number2;

        System.out.println(square);
    }
}
