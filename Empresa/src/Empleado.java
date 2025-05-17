
public class Empleado {

 private int id_empleado;
    private String nombre;
    private String apellidos;
    private String puesto;
    private double salario;

//	=== Costructor ===
    public Empleado(int id_empleado, String nombre, String apellidos, String puesto, double salario) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puesto = puesto;
        this.salario = salario;
    }

// 	=== get y set ===
    public int getIdEmpleado() {
        return id_empleado;
    }

    public void setIdEmpleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + id_empleado);
        System.out.println("Nombre: " + nombre + " " + apellidos);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);
    }
}
