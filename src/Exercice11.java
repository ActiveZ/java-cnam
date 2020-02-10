import java.util.Random;
import java.util.Scanner;
//import static De.lanceDe;

public class Exercice11 {

    public static class Main {

        public static void main(String[] args) {
            Random rd = new Random();
            Scanner sc = new Scanner(System.in);
            final int min = 0; // valeurs tirage min: 0
            final int max = 10; // valeurs tirage max: 10
            int[] tablo = new int[max+1];

            System.out.println("Entrez la taille de l'échantillon:");
            int taille  =  sc.nextInt();

            // remplissage
            for (int i=0 ; i<taille; i++) {
                // remplissage de la matrice avec les nombre aléatoires
                //int rnd = rd.nextInt(max+1);
                int rnd= De.lanceDe(min,max);
                tablo[rnd]++;
            }

            //résultat
            for (int i =0; i<max+1; i++) {
                System.out.println("Nombre de " + i + ": " + tablo[i]);
            }
        }
    }
}
