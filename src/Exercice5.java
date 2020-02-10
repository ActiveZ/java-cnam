import java.util.Scanner;

public class Exercice5 {
    static int a, b, c;


    public static boolean estRectangle() {
        return ((a*a==b*b + c*c) || (b*b==a*a + c*c) || (c*c==a*a + b*b));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a=");
        a = sc.nextInt();
        System.out.println("b=");
        b = sc.nextInt();
        System.out.println("c=");
        c = sc.nextInt();
        sc.close();

        if (estRectangle()) {
            System.out.println("le triangle est rectangle");
        }
        else {
            System.out.println("le triangle n'est pas rectangle");
        }
    }
}

