public class Main {

    public static int setBit(int number, int bitPosition) {
        return number | (1 << bitPosition);
    }

    public static int clearBit(int number, int bitPosition) {
        return number & ~(1 << bitPosition);
    }

    public static void main(String[] args) {
        double x = 2.04;
        double a = 7.07;
        double b = 5.08;
        double c = 3.22;
        double cosSquared = Math.pow(Math.cos(a * x), 2);
        double numerator = cosSquared - c * x;
        if (numerator < 0) {
            System.out.println("Помилка: чисельник не може бути від'ємним для обчислення кореня.");
            return;
        }
        numerator = Math.pow(numerator, 1.0 / 5);

        double logArgument = Math.cbrt(Math.pow(x, 5));
        double denominator = Math.log(logArgument) + b / x;
        if (denominator == 0) {
            System.out.println("Помилка: знаменник дорівнює нулю.");
            return;
        }


        double result = numerator / denominator;
        System.out.println("Значення виразу з заданими параметрами: " + result);
    }

}
