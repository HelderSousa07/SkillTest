import java.util.Scanner;

/*1. Replacing characters in place:
        Given an array of characters, write a method to replace all the spaces with “&32”.
        You may assume that the array has sufficient slots at the end to hold the additional
        characters, and that you are given the “true” length of the array. (Please perform this
        operation in place with no other auxiliary structure).
        Example:
        Input: “User is not allowed
        “,
        Output: “User&32is&32not&32allowed”*/

public class Challenge1 {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);

        System.out.println("frase: ");
        String frase = r.nextLine();

        System.out.println(replaceAllSpaces(frase));

    }
     static String replaceAllSpaces(String frase){

        return frase.replace(" ", "&32");
    }

}
