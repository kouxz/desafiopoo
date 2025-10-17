package menu;
import entities.*;

import java.util.List;

// Classe da lista dos imóveis alugados
public class ListRentedProperties {

    public static void execute(List<Property> properties) {
        System.out.println("\n--- List of Rented Properties ---");
        boolean found = false;

        for (Property p : properties) {
            if (p.isRent()) {
                found = true;
                System.out.println(p.getAdress() + ", n° " + p.getNumber());
                System.out.println(p.isRent());
                System.out.println(p.contactOwner());
                System.out.println("---------------------");
            }
        }
        if (!found) {
            System.out.println("No property is currently rented.");
        }
    }
}
