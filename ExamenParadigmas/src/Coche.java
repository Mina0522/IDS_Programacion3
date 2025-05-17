
public class Coche extends Vehiculo {

	public Coche(int velocidad_max, String tipo, int num_ruedas, String marca, String modelo) {
		super(velocidad_max, tipo, num_ruedas, marca, modelo);
		
		this.tipo = "Coche";
		this.num_ruedas = 4;
	}
	
	public void frenar() {
		System.out.println("Estado : Frenado.");
	}
	public void pitar() {
		System.out.println("Estado : beep beep.");
	}
	public void parabrisas() {
		System.out.println("Estado : Limpiando.");
	}
	public void abrirpuertas() {
		System.out.println("Estado : Puertas abiertar.");
	}
	public void cerrarpuertas() {
		System.out.println("Estado : Puertas cerradas.");
	}
	
    public void mostrarInformacion() {
    	
    	frenar();
    	pitar();
    	parabrisas();
    	abrirpuertas();
    	cerrarpuertas();
    }
}