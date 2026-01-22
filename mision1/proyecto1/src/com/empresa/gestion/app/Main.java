package mision1.proyecto1.src.com.empresa.gestion.app;

import mision1.proyecto1.src.com.empresa.gestion.model.Empleado;
import mision1.proyecto1.src.com.empresa.gestion.model.Gerente;
import mision1.proyecto1.src.com.empresa.gestion.service.NominaService;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de Gestión de Empleados");

        Empleado emp1 = new Empleado("Juan Pérez", 30, true, 'M', 50000.0);
        Gerente ger1 = new Gerente("Ana Gómez", 40, false, 'F', 80000.0, "Ventas");
        emp1.presentarse();
        ger1.presentarse();

        NominaService nominaService = new NominaService();
        double salarioEmp1 = nominaService.calcularSalarioAnual(emp1);
        double salarioGer1 = nominaService.calcularSalarioAnual(ger1);
        System.out.println("Salario anual de " + emp1.getNombre() + ": " + salarioEmp1);
        System.out.println("Salario anual de " + ger1.getNombre() + ": " + salarioGer1);
        System.out.println("\nInformación básica de los empleados:");
        emp1.mostrarInfoBasica();
        ger1.mostrarInfoBasica();
        
    }
    
}
