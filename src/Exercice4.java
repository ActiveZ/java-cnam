
public class Exercice4 {

    public static void main(String[] args) {
        double solde=10000, taux=1.045;
        int i=0;

        for (i=0; i<10; i++ ) {
            solde *= taux;
        }
        System.out.println("Solde à " + i + " ans: " + solde);



        i=0;
        solde=10000;
        while (i<10) {
            i++;
            solde *= taux;
        }
        System.out.println("Solde à " + i + " ans: " + solde);


        i=0;
        solde=10000;
        do {
            i++;
            solde *= taux;
        } while (i<10);
        System.out.println("Solde à " + i + " ans: " + solde);

    }

}
