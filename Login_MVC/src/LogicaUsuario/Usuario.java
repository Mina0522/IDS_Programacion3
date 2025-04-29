package LogicaUsuario;

import java.io.BufferedReader;
import java.io.FileReader;

public class Usuario {

	public boolean logicaU(String user, String pass) {
		
		FileReader folder;
		BufferedReader leer;
		
		try {
			
			folder = new FileReader ("C:\\Users\\gennd\\git\\IDS_Programacion3\\Login_MVC\\contra\\password.txt");
			if (folder.ready()) {
				
				leer = new BufferedReader (folder);
				String cadena;
				
				while ((cadena = leer.readLine()) != null) {
					
					String [] userRead = cadena.split(",");
					
					String userC = userRead [0];
					String userPass = userRead [1];
					
					if (userC.equals(user) && userPass.equals(pass)) {
						
						leer.close();
						return true;
					}
				}
				leer.close();
			} else {
				System.out.println("Archivo no reconocido.");

			}
			
		} catch(Exception e) {
			System.out.println("Archivo no encotrado. "+e.getMessage());
		}
		return false;
	}
}