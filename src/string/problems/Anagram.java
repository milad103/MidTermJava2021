package string.problems;


import java.util.Arrays;

public class Anagram {
    //Method 1: simple method.

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String a = "pool";
        String b = "LOOP";

        char[] c = a.toLowerCase().toCharArray();
        char[] d = b.toLowerCase().toCharArray();

        Arrays.sort(c);
        Arrays.sort(d);

        if (Arrays.equals(c, d)) {

            System.out.println("These 2 Strings are an anagram");

            System.out.println();
        } else {
            System.out.println("These 2 Strings are not an anagram");
        }
    }
}


