package juegos;

import java.util.Scanner;

// @author Diego Ramos
public class PidraPapelTijera implements Games {
    
    //VOY A USAR A USUARIO Y ORDENADOR PARA CONTABILIZAR LAS VICTORIAS DE CADA UNO.
    private int dato, ordenador = 0, usuario = 0, aleatorio = 0;
    private boolean salir = true;
    //ES MUY IMPORTANTE CREAR EL ESCÁNER COMO ATRIBUTO PARA QUE LUEGO LO PUEDA USAR CON LA LLAMADA DEL INTERFACE.
    private Scanner sc;
    

    //CONSTRUCCTOR.
    public PidraPapelTijera() {
        
        int dato;
        ordenador =0;
        usuario = 0;
        aleatorio = 0;
        salir = true;
       // TAMBIÉN CREO LA VARIABLE SCANNER DENTRO DEL CONSTRUCTOR PARA USARLO CON LA IMPLEMENTACIÓN DEL INTERFACE. 
        sc = new Scanner(System.in);
    }

    //IMPLEMENTO EL INTERFAZ.
    @Override

    public void inicio() {
        
        System.out.println("");
        System.out.println("Bienvenido al Juego de piedra, papel o tijera !!!");
        System.out.println("");
        System.out.println("Introduzca el número de la opción elegida: ");
    }

    @Override
    public void desarrollo() {
        
        /*
        * CREO EL DO CON UN SWITCH DENTRO, PARA QUE EL JUGADOR TENGA LA OPCIÓN DE JUGAR VARIAS VECES
        * Y SEA EL QUE DIGA CUÁNDO QUIERE SALIR.
        */
        
        do {

        System.out.println("");
        System.out.println("1 Para piedra.");
        System.out.println("2 Para papel.");
        System.out.println("3 Para Tijera.");
        System.out.println("4 Salir del juego.");
        System.out.println("");
        System.out.print("Introduce un número del 1 al 4:  ");
        dato = sc.nextInt();

        System.out.println("");

        aleatorio = (int) Math.ceil(Math.random() * 3);

        switch (dato) {

            case 1:

                if (aleatorio == 1) {
                    System.out.println("Tú has elegido Piedra y yo Piedra");
                    System.out.println("Hemos empatado....");
                    System.out.println("");
                } else if (aleatorio == 2) {
                    System.out.println("Tú has elegido Piedra y yo Papel");
                    System.out.println("Has perdido .....");
                    ordenador++;
                    System.out.println("");
                } else if (aleatorio == 3) {
                    System.out.println("Tú has elegido Piedra y yo Tijera");
                    System.out.println("Has ganado .....");
                    usuario++;
                    System.out.println("");
                } else {
                    System.out.println("Has introducido un dato erróneo vuelva a intentarlo.");
                    salir = true;
                }

                break;

            case 2:

                if (aleatorio == 2) {
                    System.out.println("Tú has elegido Papel y yo Papel");
                    System.out.println("Hemos empatado....");
                    System.out.println("");
                } else if (aleatorio == 1) {
                    System.out.println("Tú has elegido Papel y yo Piedra");
                    System.out.println("Has ganado .....");
                    usuario++;
                    System.out.println("");
                } else if (aleatorio == 3) {
                    System.out.println("Tú has elegido Papel y yo Tijera");
                    System.out.println("Has perdido .....");
                    ordenador++;
                    System.out.println("");
                } else {
                    System.out.println("Has introducido un dato erróneo vuelva a intentarlo.");
                    salir = true;
                }

                break;

            case 3:

                if (aleatorio == 3) {
                    System.out.println("Tú has elegido Tijera y yo Tijera");
                    System.out.println("Hemos empatado....");
                    System.out.println("");
                } else if (aleatorio == 2) {
                    System.out.println("Tú has elegido Tijera y yo Papel");
                    System.out.println("Has ganado .....");
                    usuario++;
                    System.out.println("");
                } else if (aleatorio == 1) {
                    System.out.println("Tú has elegido Tijera y yo Piedra");
                    System.out.println("Has perdido .....");
                    ordenador++;
                    System.out.println("");
                } else {
                    System.out.println("Has introducido un dato erróneo vuelva a intentarlo.");
                    salir = true;
                }

                break;

            case 4:
                System.out.println("Has salido del juego. Gracias por participar.....");
                System.out.println("");
                salir = false;
                break;
            default:
                throw new AssertionError();

        }

    }
    while (salir);
    }

    @Override
    public void fin() {
        
        System.out.println("El resultado de la partida es: Tú: " + usuario + " Computadora: " + ordenador);
        if (usuario > ordenador) {
            System.out.println("**** Has ganado, eres el mejor !!!! ****");
        } else if (usuario == ordenador) {
            System.out.println("**** Hemos empatado, buena partida !!! ****");
        } else {
            System.out.println("*** Lo siento pero has perdido ****");
        }      
        System.out.println("");
        System.out.println(" El juego a terminado, gracias por participar........");
        sc.nextLine();
        System.out.println("Presiona enter para continuar.....");
        sc.nextLine();
    }
}
