package menu;

import java.util.List;
import java.util.Scanner;

import entities.*;

// Classe para deletar uma propriedade
public class DeleteProperty {

    public static void execute(List<Property> properties, Scanner sc) {
        if (properties.isEmpty()) {
            System.out.println("No properties registered.");
            return;
        }

        System.out.println("\n--- Delete Property ---");
        for(int i = 0; i < properties.size(); i++) {
            Property prop = properties.get(i);
            System.out.println((i + 1) + " - " + prop.getAdress() + ", n° " + prop.getNumber());
        }
        System.out.println("Enter property number:" );
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index < 0 || index >= properties.size()) {
            System.out.println("Invalid property number.");
            return;
        }
        
        Property removed = properties.remove(index);
        System.out.println("Property: " + removed.getAdress() + ", n° " +
         removed.getNumber() + " has been deleted");
    }

}
