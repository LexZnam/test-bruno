package module_3;
import java.util.Scanner;
public class mod3_med2 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Высчитать дискриминант и ввести значение a, b, c");
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double summa = (b * b) - 4 * a * c;

            System.out.println(summa);
        }

}
