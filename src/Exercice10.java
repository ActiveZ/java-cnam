import java.text.Normalizer;
import java.util.Scanner;

public class Exercice10 {

    private static boolean estPalindrome(String str) {
        String revStr =""; //chaine inversée

        for (int i = str.length()-1; i>=0; i--) revStr += str.charAt(i);
        return revStr.equals(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez le texte à tester:");
        String txt  =  sc.nextLine().toLowerCase(); //passe en minuscules
        txt = Normalizer.normalize(txt, Normalizer.Form.NFD); //enlève les accents
        txt = txt.replaceAll("[^\\p{ASCII}]|\\W", "");//enlève les blancs,apostrophes, trait d'union...
        //System.out.println("txt: " + txt);

        System.out.println(estPalindrome(txt) ? "est un palindrome" : "n'est pas un palindrome"); //pour le fun
    }
}