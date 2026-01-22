package mision1.proyecto1.src.com.empresa.gestion.model;

public class Empleado extends Persona {

    private double salario;
    private int horasTrabajadas;

    public Empleado(String nombre, int edad, boolean activo, char genero, double salario, int horasTrabajadas) {
         super(nombre, edad, activo, genero);
        this.salario = salario;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public void presentarse() {
        System.out.println("Mi salario es " + salario + " dólares.");
    }

    public double calcularSalarioMensual() {

        double valorHora = salario/160; // Suponiendo 160 horas trabajadas al mes
        double salarioFinal = valorHora * horasTrabajadas;
        return salarioFinal;

    }

    //Agregamos reglas
    public boolean esMayorDeEdad() {
        return getEdad() >= 18;
    }

    public boolean puedeTrabajar(){
        return esMayorDeEdad() && activo==true;
    }
    
}
