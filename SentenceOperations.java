

import java.util.Scanner;

public class SentenceOperations {
    //Method to court the number of vowels in a string
    public static int countVowels(String sentence){
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0;  i< sentence.length(); i++) {
            if (vowels.indexOf (sentence.charAt(i)) != -1){
                count ++;
        } 
    }
    return count;
}


//Method to reverse the string
public static String reverseString(String sentence){
    StringBuilder reversed = new StringBuilder(sentence);
    return reversed.reverse().toString();
}
public static void main(String[] args){
    //create a Scanner object for input
    Scanner scanner = new Scanner(System.in);

    //Ask the user to input a sentence
    System.out.print("Please enter a sentence: ");
    String Sentence = scanner.nextLine();
    
    //Convert the sentence to uppercase
    String upperCaseSentence = Sentence.toUpperCase();
    System.out.println("Uppercase: " + upperCaseSentence);
    
    //Convert the sentence to lowercase
    String lowerCaseSentence = Sentence.toLowerCase();
    System.out.println("Lowercase:" + lowerCaseSentence);
    
    //find the length of the sentence
    int sentenceLength = Sentence.length();
    System.out.println("length of the sentence:" + sentenceLength);
    
    //Replace all spaces with underscores
    String sentenceWithUnderscores = Sentence.replace(" ", "_");
    System.out.println("Sentence with spaces replaced by underscores:" + sentenceWithUnderscores);
    
    //Count the number of vowelsin the sentence
    int vowelCount = countVowels(Sentence);
    System.out.println("Number of vowels:" + vowelCount);
    
    //Reverse the sentence
    String reversedSentence = reverseString(Sentence);
    System.out.println("Reversed sentence:" + reversedSentence);
    
    //Close the Scanner
    scanner.close();

    }
    
}



