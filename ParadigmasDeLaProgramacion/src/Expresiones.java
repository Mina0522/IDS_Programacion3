
public class Expresiones {

	public static void main(String[] args) {
		
	    // === Expresión aritmética ===
        double radio = 5.0;
        double area = Math.PI * radio * radio;
        System.out.println("Área del círculo: " + area);

        // === Expresión aritmética ===
        double num1 = 7, num2 = 10, num3 = 5;
        double promedio = (num1 + num2 + num3) / 3;
        System.out.println("Promedio: " + promedio);

        // === Expresión relacional ===
        int numero = 12;
        boolean esMayorQue10 = numero > 10;
        System.out.println("¿El número es mayor que 10? " + esMayorQue10);

        // === Expresión relacional ===
        int anio = 2024;
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        System.out.println("¿El año es bisiesto? " + esBisiesto);

	}

}
