import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    int opcion;

        do {
            System.out.println("=== CREA TU VEHICULO ===");
            System.out.println("1. Coche");
            System.out.println("2. Moto");
            System.out.println("3. Avion");
            System.out.println("4. Bicicleta");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                	
                    System.out.println("Coches");
                    System.out.println("===============");
                    System.out.println("Toyota" + "Corolla" + 180);
                    System.out.println("Ford" + "Fiesta" +170);
                    System.out.println("Nissan" + "Sentra" + 185);
                    break;

                case 2:
                	
                    System.out.println("Coches");
                    System.out.println("===============");
                    System.out.println("Toyota" + "Corolla" + 180);
                    System.out.println("Ford" + "Fiesta" +170);
                    System.out.println("Nissan" + "Sentra" + 185);
                    break;

                case 3:
                	
                    System.out.println("Coches");
                    System.out.println("===============");
                    System.out.println("Toyota" + "Corolla" + 180);
                    System.out.println("Ford" + "Fiesta" +170);
                    System.out.println("Nissan" + "Sentra" + 185);
                    break;
                    
                case 4:
                	
                    System.out.println("Coches");
                    System.out.println("===============");
                    System.out.println("Toyota" + "Corolla" + 180);
                    System.out.println("Ford" + "Fiesta" +170);
                    System.out.println("Nissan" + "Sentra" + 185);
                    break;

                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);
        scanner.close();
    }
}