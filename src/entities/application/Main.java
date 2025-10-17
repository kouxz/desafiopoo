// Desafio POO - Corretora Imobiliária

package entities.application;

import entities.*;
import menu.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criação da List
        List<Property> properties = new ArrayList<>();

        Owner owner1 = new Owner("José Francisco", "(15)991010-4502", "123.456.789-10");
        Owner owner2 = new Owner("Roberto Fernandes", "(15)991149-2091", "012.913.978-00");

        // Instânciando o imóvel
        Property house1 = new House("Rua Sorocaba", 101, owner1, 150);
        Property apt1 = new Apartment("Av. América", 15, owner2, 110);

        properties.add(house1);
        properties.add(apt1);

        boolean running = true;
        // Início painel
        while (running) {
            System.out.println("\n==== Real Estate System ====");
            System.out.println("1. Register property");
            System.out.println("2. List all properties");
            System.out.println("3. Rent or make available");
            System.out.println("4. List rented properties");
            System.out.println("5. Calculate rent value");
            System.out.println("6. Delete property");
            System.out.println("7. Exit");
            System.out.println("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            // Início switch
            switch (option) {
                // Registrar Propriedade
                case 1: 
                    RegisterProperty.execute(properties, sc);
                    break;
                case 2: 
                    ListProperties.execute(properties);
                    break;
                case 3: 
                    RentProperty.execute(properties, sc);
                    break;
                case 4: 
                    ListRentedProperties.execute(properties);
                    break;
                case 5:
                    CalculateRent.execute(properties, sc);
                    break;
                case 6:
                    DeleteProperty.execute(properties, sc);
                    break;
                case 7: 
                    running = false;
                    System.out.println("Exiting system...");
                    break;
                default: System.out.println("Invalid option. Try again.");
            }
        }
        sc.close();
    }
}
