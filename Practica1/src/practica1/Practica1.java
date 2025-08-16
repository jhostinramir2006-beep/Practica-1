/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author JOSTIN
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        while(opcion != 9) {
        System.out.println("Bienvenido a simulaciones de peleas");
        System.out.println("1. Agregar Personaje");
        System.out.println("2. Modificar Personaje");
        System.out.println("3. Eliminar Personaje");
        System.out.println("4. Ver Datos de un personaje");
        System.out.println("5. Ver Listado de personajes");
        System.out.println("6. Realizar peleas de Personajes");
        System.out.println("7. Ver Historial de Peleas");
        System.out.println("8. Ver Datos de Estudiante");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt(); //Se lee la opcion del usuario
        switch(opcion) {
             case 1:
                    break;
                case 2:
                    System.out.println("Se selecciono la opcion 2");
                    break;
                case 3:
                    System.out.println("Se selecciono la opcion 3");
                    break;
                case 4:
                    System.out.println("Se selecciono la opcion 4, saliendo del programa");
                    break;
                default:
                    System.out.println("Esta opcion es invalida");
                    break;
            }
        }
        sc.close();
        
    }
}
        
   