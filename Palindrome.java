import java.util.Scanner;//needed for scanner class
/*

*/

/**
 *Creating a program that checks if a string is a palindrome.
 * @author Sunny Kalsi
 */
public class Palindrome {

    /**
    *method that checks each character of the string to see if its the same a
    *the other half. Main palindrome method.
    *
    */
    public static boolean isPalindrome(String w){
        int length = w.length();
        if (w.length() < 2) return true;
        else return w.charAt(0) != w.charAt(length - 1) ? false :
                isPalindrome(w.substring(1, length - 1));
         //recursion
    }
    /**
    *Since we don't want capitals messing up with the program this method
    *sets all letters in the string to lowercase.
    */
    public static String setLowerCase(String word){
        String wordLow = word.toLowerCase();
        return wordLow;
    }


    /**
    *Method to get rid of all the spaces in the string to prepare for the
    * palindrome checker.
    */
    public static String setNoSpace(String word){
        String wordSpace = word.replaceAll("\\s+","");
        return wordSpace;
    }
    /**
     * @param args
     * Main method. asks for the user input string. Then prints out if it's
     * a palindrome or not.
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       String word;

       System.out.println("Please enter your string!");
       word = in.nextLine();
       word = setLowerCase(word);
       word = setNoSpace(word);

       //checks if the word is a palindrome and prints the result.
      if (isPalindrome(word)){
           System.out.println("Yes! That is a palindrome!");
       }else System.out.println("No! That  is not a palindrome!");

       }
    }
