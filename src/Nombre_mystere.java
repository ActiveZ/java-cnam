import java.util.Random;
import java.util.Scanner;

/**
 * Jeu du pendu
 * @author arnaud
 * @version 10/02/2020
 */
public class Nombre_mystere {
    /**
     * @param essai: valeur tentée par le joueur
     * @param x: nombre mystère
     * @return vrai/faux si nombre trouvé
     */
    public static boolean test(int essai, int x) {
        if (essai<x) System.out.println("Trop petit !");
        else if (essai>x) System.out.println("Trop grand !");
        return (essai==x);
    }

    public static void main(String[] args) {
        final int min = 0; // valeur tirage min: 0
        int max = 0; // valeur tirage max définie par le joueur
        int x = 0; // x est le nombre mystère dans l'intervalle [min, max]
        int essai = 0; //valeur tentée par le joueur
        int nbEssai = 0; // nombre de tentative du joueur

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la valeur max du nombre mystère:");
        max  =  sc.nextInt();
        x = rd.nextInt(max - min + 1) + min;

        do {
            nbEssai++;
            System.out.println("Entrez votre essai:");
             essai =  sc.nextInt();
        } while (!test(essai,x));

        System.out.println("Bravo ! Vous avez trouvé en " + nbEssai + " coups !");
        sc.close(); //facultatif
    }
}
