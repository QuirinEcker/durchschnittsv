import java.util.Scanner;

public class Ecker_Durchschnittsv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gesamtstrecke;
        double leavetime;
        double meettime;
        double vA;
        double vB;
        double meetpoint;

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

        meettime = leavetime + ((gesamtstrecke / (vA + vB)) / 100 * 60);
        meetpoint = (gesamtstrecke / (vA + vB) * vA);

        System.out.printf("Sie treffen sich um %.2f Uhr \n" , meettime);
        System.out.printf("Sie trefen sich %.1f Kilometer vom Punkt a entfernt wieder" , meetpoint);
    }
}
