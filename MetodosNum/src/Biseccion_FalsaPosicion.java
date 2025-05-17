
public class Biseccion_FalsaPosicion {

    public static double funcion(double x) {
        return Math.pow(x, 3) + 4 * Math.pow(x, 2) - 10;
    }

    public static void biseccion(double a, double b, double tolerancia) {
        if (funcion(a) * funcion(b) >= 0) {
            System.out.println("La función no cambia de signo en el intervalo dado.");
            return;
        }

        double c = a;
        int iteraciones = 0;
        System.out.println("Metodo de biseccion:");
        do {
            double cAnterior = c;
            c = (a + b) / 2;
            iteraciones++;

            if (funcion(a) * funcion(c) < 0) {
                b = c;
            } else {
                a = c;
            }

            double error = Math.abs((c - cAnterior) / c);
            System.out.printf("Iteracion %d: c = %.6f, error = %.6f\n", iteraciones, c, error);

            if (error < tolerancia) break;

        } while (true);

        System.out.printf("Raiz: %.6f\n", c);
    }

    public static void falsaPosicion(double a, double b, double tolerancia) {
        if (funcion(a) * funcion(b) >= 0) {
            System.out.println("La funcion no cambio.");
            return;
        }

        double c = a;
        int iteraciones = 0;
        System.out.println("Metodo de falsa posicion:");
        do {
            double cAnterior = c;

            c = b - (funcion(b) * (a - b)) / (funcion(a) - funcion(b));
            iteraciones++;

            if (funcion(a) * funcion(c) < 0) {
                b = c;
            } else {
                a = c;
            }

            double error = Math.abs((c - cAnterior) / c);
            System.out.printf("Iteracion %d: c = %.6f, error = %.6f\n", iteraciones, c, error);
            if (error < tolerancia) break;
            
        } while (true);
        System.out.printf("Raiz: %.6f\n", c);
    }
    
    public static void main(String[] args) {
        double a = 1;
        double b = 2;
        double tolerancia = 1e-4;  

        biseccion(a, b, tolerancia);
        falsaPosicion(a, b, tolerancia);
    }
}