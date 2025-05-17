import java.util.Scanner;

public class FigurasMain {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Calcular area y perimetro de un rectangulo");
            System.out.println("2. Calcular area y perimetro de un circulo");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la base del rectangulo: ");
                    double base = sc.nextDouble();
                    System.out.print("Ingresa la altura del rectangulo: ");
                    double altura = sc.nextDouble();

                    Rectangulo r = new Rectangulo(base, altura);
                    System.out.println("Area: " + r.calcularArea());
                    System.out.println("Perimetro: " + r.calcularPerimetro());
                    break;

                case 2:
                    System.out.print("Ingresa el radio del circulo: ");
                    double radio = sc.nextDouble();

                    Circulo c = new Circulo(radio);
                    System.out.println("Area: " + c.calcularArea());
                    System.out.println("Perimetro: " + c.calcularPerimetro());
                    break;

                case 3:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

            System.out.println();
        } while (opcion != 3);
    }
}
