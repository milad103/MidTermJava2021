package problemandsolutions;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.

    // simple method
    public static void addition() {
        int a = 11;
        int b = 20;
        int sum = a + b;

        System.out.println(sum);

    }
    // addition with return method;
    static int additionReturn(int f, int z) {
        return f+z;

    }


    public static void subtraction(){

        int a = 100;
        int b = 25;
        int sum1 = a-b;

        System.out.println(sum1);

    }
    // addition with return method;
    public static int subtractionReturn(int w, int y) {
        return w - y;
    }


    public static void multiplication() {

        int a = 5;
        int b = 8;
        int total = a * b;

        System.out.println(total);
    }

    // multiplication with return method;
    public static int multiplicationReturn(int r, int s) {
        return r * s;
    }

    public static void division() {

        int a = 250;
        int b = 10;
        int sum2 = a / b;

        System.out.println(sum2);
    }

    // division with return method;
    public static int divisionReturn(int u, int p){
        return u / p;
    }

    public static void main(String[] args) {
        addition();
        subtraction();
        multiplication();
        division();
        System.out.println(additionReturn(8 , 9));
        System.out.println(subtractionReturn(1000, 758));
        System.out.println(multiplicationReturn(7, 7));
        System.out.println(divisionReturn(10000, 12));
    }
}
