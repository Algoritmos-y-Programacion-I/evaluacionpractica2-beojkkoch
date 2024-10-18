package ui;

import java.util.Scanner;
import model.Controller;

public class Executable {

    private Controller control;
    private Scanner reader;

    public Executable() {

        control = new Controller();
        reader = new Scanner(System.in);

    }

    public static void main(String[] args) {

        Executable exe = new Executable();
        exe.menu();
    }
    
    /** 
     * Descripcion: Despliega el menu principal de funcionalidades al usuario
    */
    public void menu() {

        boolean flag = true;

        do {

            System.out.println("\nBienvenido a Icesi Sostenible!");
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("----------------------");
            System.out.println("1) Registrar un Proyecto en un Pillar");
            System.out.println("2) Consultar Proyectos por Pilar");
            System.out.println("0) Salir");
            int option = reader.nextInt();

            switch (option) {
                case 1:
                    registerProject();
                    break;
                case 2:
                    showProjectsByPillar();
                    break;
                case 0:
                    System.out.println("Gracias por usar nuestros servicios. Adios!");
                    flag = false;
                    break;

                default:
                    System.out.println("Opcion invalida, intente nuevamente");
                    break;
            }

        } while (flag);

    }

    /** 
     * Descripcion: Solicita al usuario la informacion necesaria para registrar un Project 
     * en un Pillar en el sistema
    */
    public void registerProject() {

        reader.nextLine();

        System.out.println("Elija el pillar al que quiere añadir un nuevo proyecto \n 1. Energia \n 2. Tratamiento de Basuras \n 3. Biodiversidad \n 4. Agua");
        int pillarType = reader.nextInt();

        System.out.println("ID del proyecto");
        String id = reader.nextLine();
        reader.nextLine();

        System.out.println("Nombre del proyecto");
        String name = reader.nextLine();

        System.out.println("Descripcion del proyecto");
        String description = reader.nextLine();

        System.out.println("Estado del proyecto \n 1. Activo \n 2. Inactivo");
        int status = reader.nextInt();
        reader.nextLine();

        boolean verify = control.registerProjectInPillar(pillarType,  id,  name,  description, status);

        if(verify==true){
            System.out.println("Se registro correctamente el proyecto ");
        }else{
            
        }
        


    }

    /** 
     * Descripcion: Muestra al usuario los Projects registrados en un Pillar 
    */
    public void showProjectsByPillar() {
        System.out.println("Elija el pillar a consultar \n 1. Energia \n 2. Tratamiento de Basuras \n 3. Biodiversidad \n 4. Agua");
        int pillarType = reader.nextInt();

        control.queryProjectsByPillar(pillarType);

    }

}