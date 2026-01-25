package mision1.proyecto1.src.com.empresa.gestion.service;

import mision1.proyecto1.src.com.empresa.gestion.model.Empleado;

public class NominaService {

    public double calcularSalarioAnual(Empleado empleado) {
        return empleado.getSalario() * 12;
    }

        public double calcularTotalNomina(double[] salarios){
        double total=0;
        for(int i=0;i<salarios.length;i++){
            total+=salarios[i];
        }
        return total;
    }   
    
}
