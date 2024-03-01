import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число и нажмите Enter");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 7 ) {
            System.out.println("Привет");
        }
    }
}
