package IUMenu;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Menu {

    public static void showMenu(){

        int option=7;
        Scanner scanner = new Scanner(System.in);


        do{
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
                scanner.reset();
                showMenu();
            }


        }while (option!=7);

    }

}
