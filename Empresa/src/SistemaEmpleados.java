import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empleado[] empleados = new Empleado[10];
        int contador = 0;
        int opcion;

        do {
            System.out.println("=== MENU EMPRESA ===");
            System.out.println("1. Agregar Gerente");
            System.out.println("2. Agregar Empleado Regular");
            System.out.println("3. Mostrar empleados");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    if (contador < empleados.length) {
                        System.out.println("Agregar Gerente");
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellidos: ");
                        String apellidos = scanner.nextLine();
                        System.out.print("Puesto: ");
                        String puesto = scanner.nextLine();
                        System.out.print("Salario: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Departamento: ");
                        String depto = scanner.nextLine();

                        empleados[contador] = new Gerente(id, nombre, apellidos, puesto, salario, depto);
                        contador++;
                        System.out.println("Gerente agregado con exito.");
                    } else {
                        System.out.println("No se pueden agregar mas empleados.");
                    }
                    break;

                case 2:
                    if (contador < empleados.length) {
                        System.out.println("Agregar Empleado Regular");
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Nombre: ");
                        String nombre = scanner.nextLine();
                        System.out.print("Apellidos: ");
                        String apellidos = scanner.nextLine();
                        System.out.print("Puesto: ");
                        String puesto = scanner.nextLine();
                        System.out.print("Salario: ");
                        double salario = scanner.nextDouble();
                        scanner.nextLine();

                        empleados[contador] = new EmpleadoRegular(id, nombre, apellidos, puesto, salario);
                        contador++;
                        System.out.println("Empleado regular agregado con exito.");
                    } else {
                        System.out.println("No se pueden agregar mas empleados.");
                    }
                    break;

                case 3:
                    System.out.println("Lista de empleados");
                    if (contador == 0) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            empleados[i].mostrarInformacion();
                            System.out.println("...");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
