package mision1.proyecto1.src.com.empresa.gestion.model;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, int edad, boolean activo, char genero, double salario, String departamento, int horasTrabajadas) {
        super(nombre, edad, activo, genero, salario, horasTrabajadas);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy el gerente del departamento de " + departamento + ".");
    }
    
}
