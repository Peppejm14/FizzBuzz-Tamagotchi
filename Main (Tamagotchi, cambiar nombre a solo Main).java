package Tamagotchi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  
        Tamagotchi tamagotchi = new Tamagotchi();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("¡Bienvenido a tu Tamagotchi!\n");

       
        do {
        
            System.out.println("¿Qué quieres hacer con tu Tamagotchi?");
            System.out.println("1. Jugar");
            System.out.println("2. Comer");
            System.out.println("3. Dormir");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

         
            switch (opcion) {
                case 1: 
                    System.out.println("\nTu Tamagotchi jugó.");
                    System.out.println("Estado: " + tamagotchi.play());
                    break;
                case 2: 
                    System.out.println("\nTu Tamagotchi comió.");
                    System.out.println("Estado: " + tamagotchi.eat());
                    break;
                case 3: 
                    System.out.println("\nTu Tamagotchi está durmiendo.");
                    System.out.println("Estado: " + tamagotchi.sleep());
                    break;
                case 4:
                    System.out.println("\n¡Adiós! Tu Tamagotchi te extrañará.");
                    break;
                default:
                    System.out.println("\nOpción no válida. Inténtalo de nuevo.");
            }

          
            if (opcion >= 1 && opcion <= 3) {
                System.out.println("\nEstado actual del Tamagotchi:");
                System.out.println("Hambre: " + tamagotchi.getHunger());
                System.out.println("Energía: " + tamagotchi.getEnergy());
                System.out.println("Humor: " + tamagotchi.getMood());
                System.out.println("---------------------------");
            }
        } while (opcion != 4);

        scanner.close();
    }
}


