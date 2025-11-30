import java.util.Scanner;

class my3 {
    static void choice1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор");
        System.out.print("""
                Выберите  действие: (1.+) (2.-) (3.*) (4./)
                Выбор:  
                """);
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Первое число: ");
            int a = scanner.nextInt();
            System.out.println("Второе число: ");
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println("Ответ: " + sum);
        }
        if (choice == 2) {
            System.out.println("Первое число: ");
            int a1 = scanner.nextInt();
            System.out.println("Второе число: ");
            int b1 = scanner.nextInt();
            int sum1 = a1 - b1;
            System.out.println("Ответ: " + sum1);
        }
        if (choice == 3) {
            System.out.println("Первое число: ");
            double a2 = scanner.nextInt();
            System.out.println("Второе число: ");
            double b2 = scanner.nextInt();
            double sum2 = a2 / b2;
            System.out.println("Ответ: " + sum2);
        }
        if (choice == 4) {
            System.out.println("Первое число: ");
            int a3 = scanner.nextInt();
            System.out.println("Второе число: ");
            int b3 = scanner.nextInt();
            int sum3 = a3 * b3;
            System.out.println("Ответ: " + sum3);

        }
    }

    void main(String[] args) {
        choice1();
    }
}
