void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("x^3 + ax^2 + bx + c = 0");
    System.out.println("");
    System.out.print("Введите первый коэффицент: ");
    double a = scanner.nextDouble();
    System.out.print("Введите второй коэффицент: ");
    double b = scanner.nextDouble();
    System.out.print("Введите третий коэффицент: ");
    double c = scanner.nextDouble();
    System.out.println("");

    double Q_res = (Math.pow(a , 2) - 3* b) / 9;
    double R_res = (2 * Math.pow(a , 3) - 9*a*b + 27*c) / 54;
    double S_res = Math.pow(Q_res , 3) - Math.pow(R_res , 2);


    if (S_res > 0 ) {
        double plenty = (1.0 / 3.0) * Math.acos(R_res / Math.sqrt(Math.pow(Q_res, 3)));
        double x1 = -2 * Math.sqrt(Q_res) * Math.cos(plenty) - a / 3;
        double x2 = -2 * Math.sqrt(Q_res) * Math.cos(plenty + 2.0 / 3.0 * Math.PI) - a / 3;
        double x3 = -2 * Math.sqrt(Q_res) * Math.cos(plenty - 2.0 / 3.0 * Math.PI) - a / 3;
        System.out.println("Три действительных корня: " + "\n" + "1." + "  " + x1 + "\n2." + "  " + x2 + "\n3." + "  " + x3);


    }
    else if (S_res < 0 && Q_res > 0 ) {

        double plenty1 = (1.0/3.0) * arcosh(Math.abs(R_res) / Math.sqrt(Math.pow(Q_res , 3)));
        double x_1 = -2 * Math.signum(R_res) * Math.sqrt(Q_res) * Math.cosh(plenty1) - a / 3;
        System.out.println("Один действительный корень: " + "\n" + "1." + "  " + x_1 );
        double x_2 = Math.signum(R_res) * Math.sqrt(Q_res) * Math.cosh(plenty1) - a / 3;
        double x2 =   Math.sqrt(3) * Math.sqrt(Q_res) * Math.sinh(plenty1);
        System.out.println("Два комплексных корня: "  );
        System.out.println("2." + "  " + x_2 + " + " + x2 + "i");
        System.out.println("3." + "  " + x_2 + " - " + x2 + "i");


    } else if (S_res < 0 && Q_res < 0 ) {
        double plenty2 = (1.0/3.0) * arcosh(Math.abs(R_res / Math.sqrt(Math.abs(Math.pow(Q_res , 3)))));
        double x_01 = -2 * Math.signum(R_res) * Math.sqrt(Math.abs(Q_res)) * Math.sinh(plenty2) - a/3;
        System.out.println("Один действительный корень: " + "\n" + "1." + "  " + x_01);
        double x_02 = Math.signum(R_res) * Math.sqrt(Math.abs(Q_res)) * Math.sinh(plenty2) - a/3;
        double x2 =  Math.sqrt(3) *Math.sqrt(Math.abs(Q_res)) * Math.cosh(plenty2);


        System.out.println("Два комплексных корня: " );
        System.out.println("2." + "  " + x_02 + " + " + x2 + "i");
        System.out.println("3." + "  " + x_02 + " - " + x2 + "i");



    } else if (S_res < 0 && Q_res == 0 ) {
        double x_1n = Math.cbrt(c - Math.pow(a , 3)/27) - a/3;
        System.out.println("Один действительный корень: " + "\n" + "1." + "  " + x_1n);
        double x_2n = - (a + x_1n / 2);
        double x2 =  (1 / 2) * Math.sqrt(Math.abs((a * 3 * x_1n) * (a * x_1n) - 4*b ));
        System.out.println("Два комплексных корня: " );
        System.out.println("2." + "  " + x_2n + " + " + x2 + "i");
        System.out.println("3." + "  " + x_2n + " - " + x2 + "i");




    } else if (S_res == 0) {
        double x01 = -2 * Math.signum(R_res) * Math.sqrt(Q_res) - a/3;
        double x02 = Math.signum(R_res) * Math.sqrt(Q_res) - a/3;
        System.out.println("Два действительных корня: " + "\n" + "1." + "  " + x01 + "\n" + "2." + "  " + x02);


    }else
        System.out.println("Неудачно");






} public static double arcosh(double x) {
    if (x < 1) {
        throw new IllegalArgumentException("arcosh(x) определён только для x >= 1");
    }
    return Math.log(x + Math.sqrt(x * x - 1));
}