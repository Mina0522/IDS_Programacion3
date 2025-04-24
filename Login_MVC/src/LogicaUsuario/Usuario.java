package LogicaUsuario;

public class Usuario {
	
	String c = "romi";
	String pass = "agua";

	public boolean logicaU(String c, String pass) {
		
		if (c.equals(c)) {
			if (pass.equals(pass)) {
				return true;
			}
			
		}else {
			return false;
		}
		return false;	
	}


}
