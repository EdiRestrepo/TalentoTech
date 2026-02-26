package gestionbiblioteca.gbiblioteca.src.com.biblioteca.gestion.app;

import java.util.InputMismatchException;
import java.util.Scanner;

import gestionbiblioteca.gbiblioteca.src.com.biblioteca.gestion.service.LibroService;

public class App {

    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner sc =new Scanner(System.in);
        LibroService service = new LibroService();
        int opcion=-1;
        System.out.println("=== SISTEMA DE GESTIÓN DE LIBROS ===");
        do{
            try{

            }catch(InputMismatchException e){
                System.out.println("Error debe ingresar un número");
                sc.nextLine();
            }catch(Exception e){
                 System.out.println("Error inesperado:"+ e.getMessage());
                sc.nextLine();

            }


        }while(opcion !=0);
        sc.close();
        System.out.println("=== PROGRAMA FINALIZADO");
    }
    
}
