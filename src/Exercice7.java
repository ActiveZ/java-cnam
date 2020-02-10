import java.util.Random;
import java.util.Scanner;

public class Exercice7 {

    public static void main(String[] args) {
        int dim1 = 1000, dim2 =1000;
        int[][] aleat  = new int[dim1][dim2];
        int rnd, rndMin, rndMax, tabMin, tabMax;
        double tabSum=0;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Valeur minimale du tableau:");
        rndMin = sc.nextInt();
        System.out.println("Valeur maximale du tableau:");
        rndMax = sc.nextInt();
        sc.close();

        System.out.println("CALCULS EN COURS ......................");

        int[] repartition = new int [rndMax-rndMin+1];

        tabMin=rndMax;
        tabMax=rndMin;
        for (int i = 0 ; i< dim1; i++) {
            for (int j=0; j< dim2; j++) {
                rnd=rand.nextInt(rndMax-rndMin+1)+rndMin;
                aleat[i][j]=rnd;
                if (rnd>tabMax) {tabMax=rnd;}
                if (rnd<tabMin) {tabMin=rnd;}
                tabSum += rnd;
                repartition[rnd-rndMin]++;
            }
        }

        System.out.println("Max du tableau: " + tabMax);
        System.out.println("Min du tableau: " + tabMin);
        System.out.println("Somme du tableau: " + (int)tabSum);
        System.out.println("Moyenne du tableau: " + (double)(tabSum/(dim1*dim2)));
        for (int i=0; i<repartition.length; i++) {
            System.out.println("Nombre de "+ (i+rndMin) + ": " + repartition[i]);
        }

    }

}
