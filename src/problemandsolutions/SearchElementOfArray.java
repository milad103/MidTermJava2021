package problemandsolutions;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.

    public static void main(String[] args) {
        //create an array of 10 elements
        int[] randomNumbers = {14, 52, 99, 2, 66, 11, 789, 18, 16, 77};

        //what are we looking for?
        int searchKey = 18;
        System.out.println("Search Key found at: " + sequentialSearch(randomNumbers, searchKey));
    }


    public static int sequentialSearch(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

