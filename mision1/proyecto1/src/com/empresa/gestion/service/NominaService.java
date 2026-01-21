package mision1.proyecto1.src.com.empresa.gestion.service;

import mision1.proyecto1.src.com.empresa.gestion.model.Empleado;

public class NominaService {

    public double calcularSalarioAnual(Empleado empleado) {
        return empleado.getSalario() * 12;
    }
    
}
