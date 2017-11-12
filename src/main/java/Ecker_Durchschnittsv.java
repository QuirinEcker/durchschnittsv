import java.util.Scanner;

public class Ecker_Durchschnittsv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gesamtstrecke;
        double leavetime;
        double vA;
        double vB;

        System.out.print("Gesammtstreck: ");
        gesamtstrecke = scanner.nextDouble();
        System.out.print("Abfahrt: ");
        leavetime = scanner.nextDouble();
        System.out.println();

        System.out.println("       Bus A        ");
        System.out.println("====================");
        System.out.print("Geschwindigkeit    : ");
        vA = scanner.nextDouble();
        System.out.println();

        System.out.println("       Bus B        ");
        System.out.println("====================");
        System.out.print("Geschwindigkeit    : ");
        vB = scanner.nextDouble();
        System.out.println();


    }
}
