package Controlador;

import VistaLogin.Login;

public class Conexion {
	
	public Login view;
	
	public Conexion() {
		
		view = new Login();
	}
	
	public void login() {
		
		view.login();
	}
	
	public void registro() {
		
		view.registro();
	}
	

}
