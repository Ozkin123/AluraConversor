package IUMenu;

import static ConectionApi.HttpConection.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void showMenu(){

        int option=0;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bienvenido digite una opcion");
            System.out.println();
            System.out.println("*****************************");
            System.out.println("1. Convertir USD a EUR");
            System.out.println("2. Convertir EUR a USD");
            System.out.println("3. Convertir COP a USD");
            System.out.println("4. Convertir COP a EUR");
            System.out.println("5. Convertir EUR a COP");
            System.out.println("6. Convertir USD a COP");
            System.out.println("7. SALIR");
            System.out.println("****************************");

            try {
                option = scanner.nextInt();
                if(option<1||option>8){
                    System.out.println("****************************");
                    System.out.println("Seleccione una opcion valida");
                    System.out.println("****************************");
                    System.out.println();
                    showMenu();
                }
            }catch (Exception e){
                System.out.println("****************************");
                System.out.println("Seleccione una opcion valida");
                System.out.println("****************************");
                showMenu();
            }
            double value=quantitySelectedUSer();
            switch (option){

                case 1:
                    createRequest("USD","EUR",value);
                    break;
                case 2:
                    createRequest("EUR","USD",value);
                    break;
                case 3:
                    createRequest("COP","USD",value);
                    break;
                case 4:
                    createRequest("COP","EUR",value);
                    break;
                case 5:
                    createRequest("EUR","COP",value);
                    break;
                case 6:
                    createRequest("USD","COP",value);
                    break;
            }

        }while (option!=7);

    }

    public static double quantitySelectedUSer(){
        Scanner scanner2 = new Scanner(System.in);
        double quantity =0;
        System.out.println("Digite cantidad a convertir");
        try {
            quantity = scanner2.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Digite un numero");
            scanner2.nextLine();
        }

        return quantity;
    }

}
