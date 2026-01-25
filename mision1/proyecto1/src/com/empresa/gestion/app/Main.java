package mision1.proyecto1.src.com.empresa.gestion.app;

import mision1.proyecto1.src.com.empresa.gestion.model.Empleado;
import mision1.proyecto1.src.com.empresa.gestion.model.Gerente;
import mision1.proyecto1.src.com.empresa.gestion.service.NominaService;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de Gestión de Empleados");

        Empleado emp1 = new Empleado("Juan Pérez", 30, true, 'M', 50000.0, 160);
        Gerente ger1 = new Gerente("Ana Gómez", 40, false, 'F', 80000.0, "Ventas",50, 10000.0);
        // emp1.presentarse();
        // ger1.presentarse();

        NominaService nominaService = new NominaService();
        double salarioEmp1 = nominaService.calcularSalarioAnual(emp1);
        double salarioGer1 = nominaService.calcularSalarioAnual(ger1);

        System.out.println("==== EMPLEADOS ====");
        System.out.println("Salario anual de " + emp1.getNombre() + ": " + salarioEmp1);
        System.out.println("¿Puede trabajar?"+ (emp1.puedeTrabajar() ? " Sí" : " No"));
        System.out.println("¿Puede trabajar?" + emp1.clasificarEmpleado());
        System.out.println("Genero " + emp1.obtenerTipoEmpleado());
        emp1.mostrarInfoBasica();
        System.out.println("");
        System.out.println("\n==== GERENTES ====");
        System.out.println("¿Puede trabajar?"+ (ger1.puedeTrabajar() ? " Sí" : " No"));
        System.out.println("Salario anual de " + ger1.getNombre() + ": " + salarioGer1);
        System.out.println("Bono del gerente: " + ger1.getBono());
        System.out.println("Salario mensual del gerente (incluyendo bono): " + ger1.calcularSalarioMensual());
        System.out.println("¿Puede trabajar?" + ger1.clasificarEmpleado());
          System.out.println("Genero " + ger1.obtenerTipoEmpleado());
        ger1.mostrarInfoBasica();
        
    }
    
}
