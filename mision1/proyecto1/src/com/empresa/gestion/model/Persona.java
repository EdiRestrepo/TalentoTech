package mision1.proyecto1.src.com.empresa.gestion.model;

public class Persona {

    //🔐 Encapsulación 
    protected String nombre;
    protected  int edad;
    protected boolean activo;
    protected char genero;
    protected int id;
    

    //📦 Constructor
    public Persona(int id,String nombre, int edad,boolean activo,char genero) {
      this.id=id;
        this.nombre = nombre;
        this.edad = edad;
        this.activo= activo;
        this.genero=genero;
    }
    //🔧 Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }
    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void presentarse() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    public void mostrarInfoBasica() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Activo: " + (activo ? "Sí" : "No"));
        System.out.println("Género: " + genero);
    }

    public int getId() {
        return id;
    }
}