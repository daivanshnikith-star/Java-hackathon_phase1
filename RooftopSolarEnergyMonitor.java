import java.util.Scanner;

public class RooftopSolarEnergyMonitor {

    static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int panelId = 101;
        double energyGenerated = 45.75;
        int numberOfPanels = 12;
        char systemStatus = 'A';

        System.out.println("Panel ID: " + panelId);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Number of Panels: " + numberOfPanels);
        System.out.println("System Status: " + systemStatus);

        System.out.print("Enter energy generated (kWh): ");
        double energy = sc.nextDouble();
        if (energy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        System.out.print("Enter morning energy (kWh): ");
        double morning = sc.nextDouble();
        System.out.print("Enter evening energy (kWh): ");
        double evening = sc.nextDouble();

        double total = calculateTotalEnergy(morning, evening);
        System.out.println("Total Energy Generated: " + total + " kWh");

        sc.close();
    }
}