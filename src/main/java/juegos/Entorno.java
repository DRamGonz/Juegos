package juegos;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
*@author Diego Ramos
*Práctica - GAME. UNIDAD 7
*/

public class Entorno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean salir = true;
        int opcion;

        //CREO LOS OBJETOS PARA CONECTAR CON LAS CLASES. 
        
        PidraPapelTijera piedraPapelTijera = new PidraPapelTijera();
        Dados dados = new Dados();
        Adivina adivina = new Adivina();
        // SI CREARA MÁS JUEGOS SÓLO TENDRÍA QUE AÑADIR MÁS CASOS Y CREAR LOS OBJETOS PARA UNIRLOS.

        try {
            while (salir) {
           
            //MENÚ
            System.out.println("************************************************************************");
            System.out.println("***                     Menú de multijuegos                          ***");
            System.out.println("*** Elija la opción deseada introduciendo el número correspondiente: ***");
            System.out.println("************************************************************************");
            System.out.println("");
            System.out.println("1. Jugar a Adivina");
            System.out.println("2. Jugar a los Dados");
            System.out.println("3. Juego a Pidra, Papel o Tijera.");
            System.out.println("4. Ver créditos");
            System.out.println("5. Salir");
            System.out.println("");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

           
               switch (opcion) {
                
                //AL TENER LOS INTERFACES CREADOS SÓLO TENGO QUE LLAMARLOS.
                case 1:

                    adivina.inicio();
                    adivina.desarrollo();
                    adivina.fin();

                    break;
                case 2:

                    dados.inicio();
                    dados.desarrollo();
                    dados.fin();

                    break;
                case 3:

                    piedraPapelTijera.inicio();
                    piedraPapelTijera.desarrollo();
                    piedraPapelTijera.fin();

                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Programa creado por Diego Ramos González");
                    System.out.println("Versión: 01");
                    System.out.println("Fecha de Creación: 21/02/2023");
                    System.out.println("Actividad Unidad 7 Programación - 1ª DAW.");
                    System.out.println("");
                    sc.nextLine();
                    System.out.println("Presiona enter para continuar.....");
                    sc.nextLine();
                    break;
                case 5:
                    System.out.println("Ha seleccionado la opción salir. Nos vemos pronto.");
                    salir = false;
                    break;
            }
            }
        } catch (InputMismatchException e) {
                System.out.println("El dato introducido no es correcto SÓLO SE PERMITE LA INTRODUCCIÓN DE UN NÚMERO DEL 1 A 5.");
                sc.next();}
    }    
}



