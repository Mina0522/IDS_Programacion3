
public class Moto extends Vehiculo {

	public Moto(int velocidad_max, String tipo, int num_ruedas, String marca, String modelo) {
		super(velocidad_max, tipo, num_ruedas, marca, modelo);
		
		this.tipo = "Moto";
		this.num_ruedas = 2;
	}
	
	public void trucos() {
		System.out.println("Estado : ¡WOOW!.");
	}
	public void maxaceleracion() {
		System.out.println("Estado : Maxima aceleracion.");
	}
	public void caer() {
		System.out.println("Estado : ouch!.");
	}
	public void detenido() {
		System.out.println("Estado : Frenado repentino.");
	}
	public void apagar() {
		System.out.println("Estado : Adios.");
	}
	
    public void mostrarInformacion() {
    	
    	trucos();
    	maxaceleracion();
    	caer();
    	detenido();
    	apagar();
    }
}