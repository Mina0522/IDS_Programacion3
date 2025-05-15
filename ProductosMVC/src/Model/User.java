package Model;

import java.util.ArrayList;

public class User {
	
    private int id;
    private String nombre;
    private String correo;
    private String rol;
    private String tel;

    public User(int id, String nombre, String correo, String rol, String tel) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
        this.tel = tel;
    }

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public String getRol() {
		return rol;
	}

	public String getTel() {
		return tel;
	}
}
