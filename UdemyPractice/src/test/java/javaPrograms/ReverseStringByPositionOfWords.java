package javaPrograms;

//Reverse string by position of words


/*
 * 
 *
Steps to follow:
Step 1: First of all we need to extract words from a given string.
Two words are separated by while space. We can use split() method given by String class 
which splits a string by provided delimiter and returns a String[] of splitted words
Step 2: Traverse from end to first position and print array content. 
 */
import java.util.Scanner;
 
public class ReverseStringByPositionOfWords
{ 
    /*
     * This method splits given string by space delimiter and returns a String
     * array.
     */
    public static String[] splitStringBySpace(String inputStringToSplit)
    {
        return inputStringToSplit.split(" ");
    }
 
    public static void main(String[] args)
    { 
        // User input for the string to know length
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the string to reverse each word:"); 
        String userInput = sc.nextLine(); 
        sc.close();
         
        // Split string strore the splited strings
        String[] splitedString = splitStringBySpace(userInput);
         
        // Output with each word reversed
        String desiredString="";
         
        // Reversing word by word and appending
        for(int j=splitedString.length-1;j>=0;j--)
        {
            desiredString= desiredString + splitedString[j] +" ";
        }         
        System.out.println("Original string........... :"+userInput);         
        System.out.println("String with reversed words :"+desiredString);
    }
}
