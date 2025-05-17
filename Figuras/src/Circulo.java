
public class Circulo {
    private double radio;
    private final double PI = 3.1416;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

    public void mostrarDatos() {
        System.out.println("Círculo:");
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
