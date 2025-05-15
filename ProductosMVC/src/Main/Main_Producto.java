package Main;
import Controller.Controlador;
import Model.Modelo;
import View.ViewBD;
import Model.User;

public class Main_Producto {

	public static void main(String[] args) {

		Modelo model = new Modelo();
		ViewBD view = new ViewBD();
		new Controlador(model, view);
		view.setVisible(true);
		
	}
}
