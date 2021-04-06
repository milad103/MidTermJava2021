package math.problems;


public class Factorial {

    // 1- Iteration

    public static int iterationFactorial(int a){

        int number = 1;

        for (int i = 1; i <= 5; i++){
            number = number * i;
        }

        return number;

    }

    // 2- Recursion

    public static int recursionFactorial(int a){
        if (a == 0) return 1;
        return  a * recursionFactorial((a - 1));
    }

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int a =5;

        System.out.println("The Factorial of 5 is: " + iterationFactorial(a));
        System.out.println("The Factorial of 5 is: " + recursionFactorial(a));


        // Method 2 of iteration:

        int factorialProduct = 1;
        for(int i=1; i<=5; i++) {

            factorialProduct = factorialProduct * i;
        }

        System.out.println("The Factorial of 5 is: " + factorialProduct);

    }
}
