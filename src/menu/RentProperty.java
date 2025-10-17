package menu;

import entities.*;

import java.util.List;
import java.util.Scanner;

// Alugar ou disponibilizar propriedade
public class RentProperty {
    // Alugar propriedade
    // Uitlizando static para não instanciar objetos desnecessários na main
    public static void execute(List<Property> properties, Scanner sc) {
        System.out.println("\n--- Rent Or make Available ---");
        if (properties.isEmpty()) {
            System.out.println("No properties registered yet.");
            return;
        }
        System.out.println("Choose a property: ");
        for (int i = 0; i < properties.size(); i++) {
            System.out.println((i + 1) + " - " + properties.get(i).getAdress() +
                    " (Number: " + properties.get(i).getNumber() + ")");
        }

        System.out.println("Enter the property number from the list: ");
        int index = sc.nextInt() - 1;

        // verificação do número digitado
        if (index < 0 || index >= properties.size()) {
            System.out.println("Invalid option");
            return;
        }

        Property prop = properties.get(index);

        prop.setRented(!prop.isRent());

        System.out.println(prop.isRented());
    }
}
