package juegos;

import java.util.Scanner;

// @author Diego Ramos
class Dados implements Games {

    private String nombre, nombre2;
    private int aleatorio1 = 0, aleatorio2=0;
    //ES MUY IMPORTANTE CREAR EL ESCÁNER COMO ATRIBUTO PARA QUE LUEGO LO PUEDA USAR CON LA LLAMADA DEL INTERFACE.
    private Scanner sc;

    //CONSTRUCTOR.
    public Dados() {
        String nombre;
        String nombre2;
        //NO HACE FALTA PONER INT PORQUE YA ESTÁ INICIALIZADO.
        aleatorio1 = 0;
        aleatorio2 = 0;
        // TAMBIÉN CREO LA VARIABLE SCANNER DENTRO DEL CONSTRUCTOR PARA USARLO CON LA IMPLEMENTACIÓN DEL INTERFACE. 
        sc = new Scanner(System.in);
    }

    //IMPLEMENTACIÓN DE INTERFAZ.
    @Override
    public void inicio() {

        System.out.println("");
        System.out.println("Bienvenido al juego de los Dados!!!");
        System.out.println("");
        System.out.print("Introduce el nombre de usuario del primer Jugador: ");
        nombre = sc.nextLine();
        System.out.println("");
        System.out.print("Introduce el nombre de usuario del segundo Jugador: ");
        nombre2 = sc.nextLine();
        System.out.println("");

        
    }

    @Override
    public void desarrollo() {

        //CON EL MATH.CEIL DELANTE DEL MATH.RANDOM EVITO QUE ME SALGA EL NÚMERO 0 QUE EN ESTE CASO NO ME HACE FALTA.
        aleatorio1 = (int) Math.ceil(Math.random() * 6);
        
        System.out.println("Empieza el juego, turno de " + nombre + " presione enter para tirar el dado:");
        sc.nextLine();

        System.out.println("El número que ha sacado " + nombre + " es el: " + aleatorio1);
        System.out.println("");

        System.out.println("Turno de " + nombre2 + " presione enter para tirar el dado:");
        sc.nextLine();
        aleatorio2 = (int) Math.ceil(Math.random() * 6);

        System.out.println("El número que ha sacado " + nombre2 + " es el: " + aleatorio2);

        System.out.println("");

        if (aleatorio1 > aleatorio2) {

            System.out.println("El ganador del juego es: ***********  " + nombre + "  ********** con el número " + aleatorio1
                    + " Felicidades........");

        } else if (aleatorio2 > aleatorio1) {

            System.out.println("El ganador del juego es: ***********  " + nombre2 + "  ************ con el número " + aleatorio2);

        } else {

            System.out.println("Han empatado los dos !!!!!!!");

        }
    }

    @Override
    public void fin() {

        System.out.println("");
        System.out.println(" El juego a terminado, gracias por participar........");
        System.out.println("");
        System.out.println("Presiona enter para continuar.....");
        sc.nextLine();
    }
}
