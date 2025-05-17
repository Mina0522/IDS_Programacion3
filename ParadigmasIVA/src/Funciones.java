public class Funciones {
	
    public static double descuento (double[] precios, double[] porcentajes) {
    	
        double total = 0;
        for (int i = 0; i < precios.length; i++) {
            double precioFinal = precios[i] - (precios[i] * porcentajes[i] / 100);
            total += precioFinal;
        }
        return total;
    }
    
    public static double iva (double[] precios, double[] porcentajes) {
    	
        double total = 0;
        for (int i = 0; i < precios.length; i++) {
            double precioFinal = precios[i] + (precios[i] * porcentajes[i] / 100);
            total += precioFinal;
        }
        return total;
    }
    
    public static void log(String frase) {
    	
        String[] palabras = frase.split(" ");
        System.out.println("La frase y su longitud es:");
        for (int i = 0; i < palabras.length; i++) {
            String palabra = palabras[i];
            int longitud = palabra.length();
            System.out.println("La palabra: " + palabra + " tiene: " + longitud + " letras.");
        }
    }

    public static void main(String[] args) {
        String[] productos = {"Leche", "Pan", "Huevos"};
        double[] precios = {20.0, 15.0, 30.0};
        double[] porcentajes = {10.0, 5.0, 8.0};

        double totalDescuento = descuento(precios, porcentajes);
        System.out.println("Total con descuento: $" + totalDescuento);

        double totalIVA = iva(precios, porcentajes);
        System.out.println("Total con IVA: $" + totalIVA);

        String frase = "me gustan los tacos de asada";
        log(frase);
    }
}
