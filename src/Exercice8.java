import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entrez la note de l'élève:");
        int note = sc.nextInt();
        switch (note) {
            case 0 :
            case 1 :
            case 2 :
                System.out.println("Très insuffisant");
                break;
            case 3 :
            case 4 :
                System.out.println("Insuffisant");
                break;
            case 5 :
            case 6 :
                System.out.println("moyen");
                break;
            case 7 :
            case 8 :
                System.out.println("Bien");
                break;
            case 9 :
            case 10 :
                System.out.println("Très bien");
                break;
            default :
                System.out.println("ERREUR ! La note doit être entre 0 et 10");
        }

    }
}
