
public class Gerente extends Empleado {
    private String departamento;

    public Gerente(int id_empleado, String nombre, String apellidos, String puesto, double salario, String departamento) {
        super(id_empleado, nombre, apellidos, puesto, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
}

