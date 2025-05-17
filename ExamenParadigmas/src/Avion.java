
public class Avion extends Vehiculo {

	public Avion(int velocidad_max, String tipo, int num_ruedas, String marca, String modelo) {
		super(velocidad_max, tipo, num_ruedas, marca, modelo);
		
		this.tipo = "Avion";
		this.num_ruedas = 6;
	}
	
	public void volar() {
		System.out.println("Estado : En el aire.");
	}
	public void aterrizar() {
		System.out.println("Estado : Aterrizando.");
	}
	public void turbina() {
		System.out.println("Estado : oh tenemos turbulencia!.");
	}
	public void protocolo() {
		System.out.println("Estado : Ponga atencion.");
	}
	public void cerrarpuertas() {
		System.out.println("Estado : Puertas cerradas.");
	}
	
    public void mostrarInformacion() {
    	
    	volar();
    	aterrizar();
    	turbina();
    	protocolo();
    	cerrarpuertas();
    }
}