import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        String rightName = "Вячеслав";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals(rightName)){
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

    }
}
