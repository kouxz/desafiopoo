package menu;

import java.util.List;

import entities.*;

// Classe para listar todas as propriedades
public class ListProperties {
    public static void execute(List<Property> properties) {
        if (properties.isEmpty()) {
            System.out.println("No properties registered.");
            return;
        } else {
            System.out.println("\n--- List of Properties ---");
            for (int i = 0; i < properties.size(); i++) {
                Property prop = properties.get(i);
                System.out.println((i + 1) + ". " + prop.getAdress() + ", n° " + prop.getNumber());
                prop.isRented();
                System.out.println(prop.contactOwner());
                System.out.println("------------------------");
            }
        }
    }

}
