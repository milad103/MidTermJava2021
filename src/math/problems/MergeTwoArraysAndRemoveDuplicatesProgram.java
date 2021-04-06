package math.problems;


import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArraysAndRemoveDuplicatesProgram {

    // Merge Two Arrays Into Single Sorted Array Without Duplicates
    // given  arrayA={3,4, 1}
    // given  arrayB={7,4,5,6,8}
    // output {1,3,4,5,6,7,8}

    static int[] mergeTwoArraysAndRemoveDuplicates (int[] arrayA, int[] arrayB) {

        return IntStream.concat(IntStream.of(arrayA), IntStream.of(arrayB)).distinct().sorted().toArray();
    }

    public static void main(String[] args) {

        int[] arrayA = {3, 4, 1};

        int[] arrayB = { 7, 4, 5, 6, 8};

        int [] mergedArray = mergeTwoArraysAndRemoveDuplicates(arrayA, arrayB);

        System.out.println("Array A: " + Arrays.toString(arrayA));
        System.out.println("Array B: " + Arrays.toString(arrayB));
        System.out.println("Sorted & Merged array without duplicates: " );
        System.out.println(Arrays.toString(mergedArray));
    }




}