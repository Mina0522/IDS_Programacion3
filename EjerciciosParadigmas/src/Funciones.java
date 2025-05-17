import java.util.Scanner;

public class Funciones {

    // === SUMA
    public static int sumarLista(int[] numeros) {
        int suma = 0;
        System.out.print("Numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(" + ");
            }
            suma += numeros[i];
        }
        System.out.println();
        return suma;
    }

    // === PALABRAS Y LONGITUDES
    public static int[] longitudes(String[] palabras) {
        int[] resultado = new int[palabras.length];
        System.out.println("*Longitudes*");
        for (int i = 0; i < palabras.length; i++) {
            resultado[i] = palabras[i].length();
            System.out.println(palabras[i] + " == " + resultado[i] + " letras");
        }
        return resultado;
    }

    static class Persona {
        String nombre;
        int edad;

        Persona(String n, int e) {
            nombre = n;
            edad = e;
        }
    }

    // === PROMEDIOS DE EDADES
    public static int promedioEdad(Persona[] personas) {
        int suma = 0;
        System.out.println("*Edades*");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i].nombre + " tiene " + personas[i].edad + " años");
            suma += personas[i].edad;
        }
        return suma / personas.length;
    }

    public static int incrementar(int n) {
        return n + 1;
    }

    public static int multiplicarPorTres(int n) {
        return n * 3;
    }

    public static int aplicarAmbas(int n) {
        int r1 = incrementar(n);
        int r2 = multiplicarPorTres(r1);
        return r2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("=== SUMA DE NÚMEROS ===");
        System.out.println("Suma total: " + sumarLista(lista));

        String[] palabras = {
            "tenedor", "tacos de asada", "chicharron", "mundo", "rojo",
            "caminar", "puerta", "pasto", "cielo", "nubes"
        };
        System.out.println("=== LONGITUDES DE PALABRAS ===");
        longitudes(palabras);

        Persona[] personas = {
            new Persona("Marisol", 24),
            new Persona("Luisa", 27),
            new Persona("Adriana", 67),
            new Persona("Anahi", 45),
            new Persona("Camila", 32)
        };
        System.out.println("=== PROMEDIO DE EDADES ===");
        System.out.println("Promedio de edades: " + promedioEdad(personas));

        System.out.println("=== APLICAR FUNCIONES ===");
        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();
        int resultado = aplicarAmbas(numero);
        System.out.println("Resultado: " + resultado);
    }
}
