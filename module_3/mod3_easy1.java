package module_3;
import java.util.Scanner;
public class mod3_easy1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = 0;
        c = a;
        a = b;
        b = c;

            System.out.println("Пользователь ввел значение для a: " +  a + " и b: " + b);
    }
}
