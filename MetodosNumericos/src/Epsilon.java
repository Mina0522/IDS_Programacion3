
public class Epsilon {

	public static void main(String[] args) {

		        double epsilon = 1.0;

		        while (1.0 + epsilon > 1.0) {
		            epsilon /= 2.0;
		        }

		        epsilon *= 2.0;

		        System.out.println("El número epsilon de la máquina es: " + epsilon);

	}

}
