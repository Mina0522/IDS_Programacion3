package Controlador;

import VistaLogin.Login;
import LogicaUsuario.Usuario;

	public class Conexion{
	
    private Usuario model;
    private Login view;

    public Conexion(Login view, Usuario model) {
        this.view = view;
        this.model = model;
    }
  
    public void iniciar() {
        view.setVisible(true);
    }

    public boolean verificar() {
        String user = view.getusuario();
        String pass = view.getpass();
        return model.logicaU(user, pass);
    }

    public boolean registrarNuevoUsuario() {
        String user = view.getusuario();
        String pass = view.getpass();
        return model.nuevacuenta(user, pass);
    }
}
