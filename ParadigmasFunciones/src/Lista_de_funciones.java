import java.util.ArrayList;
import java.util.List;

public class Lista_de_funciones {

    // === NUMEROS DUPLICADOS
    public static List<Integer> duplicarLista(List<Integer> lista) {
        List<Integer> duplicados = new ArrayList<>();
        for (int num : lista) {
            duplicados.add(num * 2);
        }
        return duplicados;
    }

    // === NUMEROS PARES
    public static List<Integer> obtenerPares(List<Integer> lista) {
        List<Integer> pares = new ArrayList<>();
        for (int num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            }
        }
        return pares;
    }

    // === minusculas Y MAYUSCULAS
    public static List<String> capitalizarNombres(List<String> lista) {
        List<String> capitalizados = new ArrayList<>();
        for (String nombre : lista) {
            if (!nombre.isEmpty()) {
                String capitalizado = nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();
                capitalizados.add(capitalizado);
            }
        }
        return capitalizados;
    }

    // === LONGITUD
    public static List<String> filtrarPorLongitud(List<String> lista, int longitudMinima) {
        List<String> resultado = new ArrayList<>();
        for (String palabra : lista) {
            if (palabra.length() >= longitudMinima) {
                resultado.add(palabra);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
    	
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        System.out.println("Lista: " + numeros);
        System.out.println("Duplicados: " + duplicarLista(numeros));
        System.out.println();

        List<Integer> numeros10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Lista: " + numeros10);
        System.out.println("Pares: " + obtenerPares(numeros10));
        System.out.println();

        List<String> nombres = List.of("romina", "sofia", "clara");
        System.out.println("Lista: " + nombres);
        System.out.println("Capitalizados: " + capitalizarNombres(nombres));
        System.out.println();

        List<String> palabras = List.of("sandia", "jamaica", "tacos", "uva");
        int longitudMinima = 5;
        System.out.println("Lista: " + palabras);
        System.out.println("Palabras filtradas: " + filtrarPorLongitud(palabras, longitudMinima));
    }
}
