package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */


        String n = "noon";
        String reverse = "";
        String m = "milad";
        String back = "";

        char[] word1 = n.toCharArray();
        char[] word2 = m.toCharArray();

        for (int i = n.length() - 1; i >= 0; i--) {
            reverse = reverse + n.charAt(i);
            for (int j = m.length() - 1; j >= 0; j--) {
                back = back + m.charAt(i);
            }
        }
        if (n.equals(reverse)) {
            System.out.println("word " + n + " is a Palindrome");
        } else {
            System.out.println("word " + n + " is NOT a Palindrome");
        }

        if (m.equals(back)) {
            System.out.println("word " + m + " is a Palindrome");
        } else {
            System.out.println("word " + m + " is NOT a Palindrome");
        }


    }
}
