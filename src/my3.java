void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("ax^2 + bx + c = 0");
    System.out.print("Введите первый коэффицент: " );
    Double a = scanner.nextDouble();
    System.out.print("Введите второй коэффицент: "  );
    Double b = scanner.nextDouble();
    double b1 = Math.pow(b , 2);
        System.out.print("Введите третий коэффицент: "  );
    Double c = scanner.nextDouble();
    double disc = b1-4*a*c;
    if (disc > 0) {
        double x_1 = -b +Math.sqrt(disc) / 2 * a;
        double x_2 = -b -Math.sqrt(disc) /2 * a;
        System.out.println("Два корня:" + x_1 + "," + x_2);

    }if (disc == 0 ) {
        double x1 = -b +Math.sqrt(disc) /2 * a;
        System.out.println("Один корень: " + x1);
    }if (disc < 0) {
        System.out.println("Нет корней");
    }





}