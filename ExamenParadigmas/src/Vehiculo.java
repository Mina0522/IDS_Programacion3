
public class Vehiculo {
	
	public int velocidad_max;
	public String tipo;
	public int num_ruedas;
	public String marca;
	public String modelo;
	
	public Vehiculo(int velocidad_max, String tipo, int num_ruedas, String marca,String modelo) {
		this.velocidad_max = velocidad_max;
		this.tipo = tipo;
		this.num_ruedas = num_ruedas;
		this.marca = marca;
		this.modelo =modelo;
	}
	
	public void apagar() {
		System.out.println("Estado : Apagado.");
	}
	public void encender() {
		System.out.println("Estado : Encendido.");
	}
	public void volar() {
		System.out.println("Estado : En vuelo.");
	}
	public void acelerar() {
		System.out.println("Estado : Acelerado.");
	}
	
	public int getVelocidad_max() {
		return velocidad_max;
	}

	public void setVelocidad_max(int velocidad_max) {
		this.velocidad_max = velocidad_max;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNum_ruedas() {
		return num_ruedas;
	}

	public void setNum_ruedas(int num_ruedas) {
		this.num_ruedas = num_ruedas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
    public void mostrarInformacion() {
        System.out.println("Velocidad maxima: " + velocidad_max);
        System.out.println("Tipo: " + tipo);
        System.out.println("Numero de ruedas: " + num_ruedas);
        System.out.println("Modelo" + modelo);
    }
	

}
