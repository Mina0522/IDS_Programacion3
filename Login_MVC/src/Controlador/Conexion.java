package Controlador;

import VistaLogin.Login;
import LogicaUsuario.Usuario;

public class Conexion {
	
	public Usuario model;
	public Login view;
	
	public Conexion() {
		
		this.model = model;
		this.view = new Login();
		this.view.setVisible(true);
	}

	public void login() {
 		
 		view.login();
 	}
	
    public boolean verificar(String usuario,String pass) {
     	String user = view.getusuario();
     	String password = view.getpass();
     	
     	return model.logicaU(user, password);

	
    }
}
