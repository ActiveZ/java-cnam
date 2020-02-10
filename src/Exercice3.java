
/**
 * Exercice 3 –Les conditionnels et calculsEcrire  un  programme  qui prend deux  entiers  et  affiche  leur  somme,  leur  différence, leur produit et leur quotient. Attention, on ne peut pas diviser par 0
 * @author hoc
 *
 */
public class Exercice3 {

    public static void main(String[] args) {

        int a=10, b=3;

        System.out.println("Somme "+ a + " + " + b + " = " + (a+b));
        System.out.println("Différence "+ a + " - " + b + " = " + (a-b));
        System.out.println("Produit "+ a + " x " + b + " = " + (a*b));
        if (b!=0) {
            System.out.println("Quotient "+ a + " / " + b + " = " + (double)a/b);
        }
        else {
            System.out.println("ERREUR: division par 0");
        }
    }
}
