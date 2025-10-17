package menu;

import java.util.List;
import java.util.Scanner;

import entities.*;

public class CalculateRent {
    public static void execute(List<Property> properties, Scanner sc) {
        if (properties.isEmpty()) {
            System.out.println("No properties registered.");
            return;
        }
        System.out.println("\n --- Calculate Rent ---");
        for (int i = 0; i < properties.size(); i++) {
            Property prop = properties.get(i);
            System.out.println((i + 1) + " - " + prop.getAdress() + ", n° " + prop.getNumber());
        }

        System.out.println("Choose a property number: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index < 0 || index >= properties.size()) {
            System.out.println("Invalid property number.");
            return;
        }

        System.out.println("Enter the number of days to rent: ");
        int days = sc.nextInt();
        sc.nextLine();

        Property proper = properties.get(index);
        int total = proper.calculateRent(days);

        System.out.println("The total rent for " + days + " days is: $" + total);
    }
}
