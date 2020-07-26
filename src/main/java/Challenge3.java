
import java.util.Scanner;

/*3. Check words with typos:There are three types of typos that can be performed on strings: insert a character,
        remove a character, or replace a character. Given two strings, write a function to
        check if they are one typo (or zero typos) away.
        Examples:
        pale, ple ­> true
        pales, pale ­> true
        pale, bale ­> true
        pale, bake ­> false*/

public class Challenge3 {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        int match = 0;
        boolean typo = false;

        System.out.println("string 1: ");
        String palavra1 = r.nextLine();

        System.out.println("string 2: ");
        String palavra2 = r.nextLine();

        char[] array_palavra1 = palavra1.toCharArray();
        char[] array_palavra2 = palavra2.toCharArray();

        String[] str1 = new String[palavra1.length()];
        String[] str2 = new String[palavra2.length()];

        for (int i=0; i < palavra1.length(); i++){
            str1[i] = String.valueOf(array_palavra1[i]);
        }

        for (int i=0; i < palavra2.length(); i++){
            str2[i] = String.valueOf(array_palavra2[i]);
        }

        if (palavra1.length() - palavra2.length() == 1 || palavra1.length() == palavra2.length()){
            for (int i=0; i < palavra1.length(); i++){
                for (int j=0; j < palavra2.length(); j++){
                    if (str1[i].contains(str2[j])){
                        match++;
                    }
                }
            }
            if (match == palavra1.length()-1){
                typo = true;
            }else{
                typo = false;
            }
        }

        System.out.println(palavra1+", "+palavra2+" -> "+typo+ " "+match);

    }

}
