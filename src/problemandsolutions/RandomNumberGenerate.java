package problemandsolutions;

import java.util.Random;

public class RandomNumberGenerate {
    //Write Java program to generate a random number between 1 to 8.

    public static int getRandomInteger ( int max){
        return (int) (Math.random() * max);
    }


    public static void main(String[] args) {

        System.out.println("Random number between 1 and 8 : " + getRandomInteger(8));


    }

}