public class Test {

    private static double number1 = 15, number2 = 3;

    public static void main(String[] args) {
        System.out.println(add(number1, number2));
        System.out.println(subtract(number1, number2));
        System.out.println(multiply(number1, number2));
        System.out.println(10/0);
    }

    public static double add(double number1, double number2)
    {
        return number1+number2;
    }

    public static double subtract(double number1, double number2)
    {
        return number1-number2;
    }

    public static double multiply(double number1, double number2)
    {
        return number1*number2;
    }

    public static double divide(double number1, double number2)
    {
        return number1/number2;
    }

}
