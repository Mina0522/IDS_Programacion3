import Controlador.Conexion;
import LogicaUsuario.Usuario;
import VistaLogin.Login;

public class Main {

	public static void main(String[] args) {

        Conexion controlador = new Conexion(Login view, Usuario model);
        Login vista = new Login();
        vista.login(controlador);
	}

}
