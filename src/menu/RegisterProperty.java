package menu;

import entities.*;

import java.util.List;
import java.util.Scanner;

public class RegisterProperty {
    // Criando método para executar no main o registro de imóvel
    public static void execute(List<Property> properties, Scanner sc) {
         System.out.println("Type of property (1-House / 2-Apartment): ");
                    int type = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Adress: ");
                    String adress = sc.nextLine();

                    System.out.println("Number: ");
                    int number = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Owner's name");
                    String name = sc.nextLine();

                    System.out.println("Phone: ");
                    String phone = sc.nextLine();

                    System.out.println("CPF: ");
                    String cpf = sc.nextLine();

                    System.out.println("Rent value: ");
                    int rentValue = sc.nextInt();
                    sc.nextLine();

                    Owner owner = new Owner(name, phone, cpf);

                    Property prop = (type == 1) ? new House(adress, number, owner, rentValue)
                            : new Apartment(adress, number, owner, rentValue);

                    properties.add(prop);
                    System.out.println("Property registered sucessfully!");
                }

    }

