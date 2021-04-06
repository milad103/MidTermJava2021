package string.problems;


import java.util.*;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
        String statement = "Java is a programming language. Java is also an Island of Indonesia. Java is a widely used language";
        List<String> list = Arrays.asList(statement.split(" "));

        Set<String> uniqueWords = new HashSet<String>((list));
        for (String word : uniqueWords) {
            System.out.println(word + ": " + Collections.frequency(list, word) + " time(s)");
        }



        double TotalCharacters;
        double AverageofWords;

        TotalCharacters = statement.length() - (list.size() - 1);
        System.out.println("The total Character of The String statement : " + TotalCharacters);

        AverageofWords = TotalCharacters / list.size();
        System.out.println("The Average Length of The Word in String statement: " + AverageofWords);
    }

}
