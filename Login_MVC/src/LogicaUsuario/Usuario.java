package LogicaUsuario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class Usuario {

	public boolean logicaU(String user, String pass) {
		JSONObject root;
        JSONArray usuario;

        try {
            File archivo = new File("src/files/usuarios.json");
            if (archivo.exists()) {
                FileReader leer = new FileReader(archivo);
                root = new JSONObject(new JSONTokener(leer));
                usuario = root.getJSONArray("usuarios");
                leer.close();
            } else {
                root = new JSONObject();
                usuario = new JSONArray();
                root.put("usuarios", usuario);
            }
            JSONObject nuevo = new JSONObject();
            nuevo.put("usuario", user);
            nuevo.put("pass", pass);

            usuario.put(nuevo);

            FileWriter esc = new FileWriter("src/files/usuarios.json");
            esc.write(root.toString(4));
            esc.close();

            System.out.println("Guardado con exito!");
            
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
	
	 public boolean nuevacuenta(String user, String pass, String nombre,
			 String apellido, String empresa,
			 String area, String cargo, String correo,
			 String contrasenia, String confirmar_contrasenia
			 ) {
	        JSONObject root;
	        JSONArray usuario;

	        try {
	            File archivo = new File("src/files/usuarios.json");
	            if (archivo.exists()) {
	                FileReader reader = new FileReader(archivo);
	                root = new JSONObject(new JSONTokener(reader));
	                usuario = root.getJSONArray("usuarios");
	                reader.close();
	            } else {
	                root = new JSONObject();
	                usuario = new JSONArray();
	                root.put("usuarios", usuario);
	            }

	            JSONObject nuevo = new JSONObject();
	            nuevo.put("usuario", user);
	            nuevo.put("pass", pass);
	            usuario.put(nuevo);

	            FileWriter esc = new FileWriter("src/files/usuarios.json");
	            esc.write(root.toString(4));
	            esc.close();

	            System.out.println("Guardado con exito!.");
	            return true;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
}