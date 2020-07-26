import java.util.Scanner;

/*2. Check words with jumbled letters :
        Our brain can read texts even if letters are jumbled, like the following sentence: “ Yuo
        cna porbalby raed tihs esaliy desptie teh msispeillgns.” Given two strings, write a
        method to decide if one is a partial­permutation of the other. Consider a
        partial­permutation only if:
        - The first letter hasn’t changed place
        - If word has more than 3 letters, up to 2/3 of the letters have changed place
        Examples:
        you, yuo ­> true
        probably, porbalby ­> true
        despite, desptie ­> true
        moon, nmoo ­> false
        misspellings, mpeissngslli ­> false*/

public class Challenge2 {

    public static void main(String[] args) {

        Scanner r = new Scanner(System.in);
        //partial-permutation
        boolean pp = false;
        int cont = 0;

        System.out.println("string 1: ");
        String palavra1 = r.nextLine();

        System.out.println("string 2: ");
        String palavra2 = r.nextLine();

        if (palavra1.charAt(0) == palavra2.charAt(0)){
            pp = true;
            for (int i = 0; i < palavra1.length(); i++){
                if (palavra1.charAt(i) != palavra2.charAt(i)){
                    cont++;
                }
            }
        }

        // 2/3 = 0.66666667
        if (palavra1.length() > 3){
            if (cont > (0.66666667 * palavra1.length())){
                pp = false;
            }
        }

        System.out.println(palavra1 + ","+ palavra2 + " -> "+pp);

    }

}
