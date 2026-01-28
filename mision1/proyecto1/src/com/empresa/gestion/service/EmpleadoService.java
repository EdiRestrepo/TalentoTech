package mision1.proyecto1.src.com.empresa.gestion.service;
import mision1.proyecto1.src.com.empresa.gestion.model.Empleado;

import java.util.List;
import java.util.ArrayList;

public class EmpleadoService {

    private List<Empleado> empleados = new ArrayList<>();

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    public List<Empleado> obtenerEmpleados() {
        if(empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return null;
        }

        for(Empleado emp : empleados) {
            System.out.println("ID: " + emp.getId() + ", Nombre: " + emp.getNombre() + "Edad: " + emp.getEdad());
        }
        return empleados;
    }

    public void eliminarEmpleado(int id){
        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).getId()==id){
                System.out.println("Empleado eliminado: "+empleados.get(i).getNombre());
                empleados.remove(i);
                return;
            }
        }
        System.out.println("Empleado con ID "+id+" no encontrado.");
    }

    // public void eliminarEmpleado(int id) {
    //     Empleado empleadoAEliminar = null;
    //     for(Empleado emp : empleados) {
    //         if(emp.getId() == id) {
    //             empleadoAEliminar = emp;
    //             break;
    //         }
    //     }
    //     if(empleadoAEliminar != null) {
    //         empleados.remove(empleadoAEliminar);
    //         System.out.println("Empleado eliminado: " + empleadoAEliminar.getNombre());
    //     } else {
    //         System.out.println("Empleado con ID " + id + " no encontrado.");
    //     }
    // }
 
}
