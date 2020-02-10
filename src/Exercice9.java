import java.util.Scanner;

public class Exercice9 {

    public static double calculComm(double comm) {
        return comm * 1.09;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int fixe = 200;
        double comm = 0;

        System.out.println("Saisir le montant des ventes (0=>fin)");
        int i = 0;
        do {
            System.out.println("Montant de la vente:");
            i = sc.nextInt();
            if (i > 0) {
                comm += i;
            }
        } while (i > 0);
        comm = calculComm(comm);
        System.out.println("Total commission: " + comm);
        System.out.println("Total salaire: " + (comm + fixe));
    }
}
