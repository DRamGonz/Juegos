package juegos;

// @author Diego Ramos
import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivina implements Games {

    //CREO LAS VARIABLES COMO PRIVATE PORQUE SÓLO ME HACEN FALTA PARA ESTA CLASE.
    private String nombre;
    private int aleatorio1 = 0, numero = 0, intento = 1;
    private boolean repeticion = true;
    //ES MUY IMPORTANTE CREAR EL ESCÁNER COMO ATRIBUTO PARA QUE LUEGO LO PUEDA USAR CON LA LLAMADA DEL INTERFACE.
    private Scanner sc;

    public Adivina() {

        String nombre;
        aleatorio1 = 0;
        numero = 0;
        //INTENTO SE INICIALIZA EN 1 PORQUE YA LA PRIMERA VEZ QUE ENTRA CUENTA COMO UNA OPORTUNIDAD.
        intento = 1;
        repeticion = true;
        // TAMBIÉN CREO LA VARIABLE SCANNER DENTRO DEL CONSTRUCTOR PARA USARLO CON LA IMPLEMENTACIÓN DEL INTERFACE. 
        sc = new Scanner(System.in);

    }

    //implemento el interfax.
    @Override
    public void inicio() {

        System.out.println("");
        System.out.println("Bienvenido al juego ADIVINA!!!!!");
        System.out.println("");
        System.out.print("Introduce tu nombre de usuario: ");
        nombre = sc.nextLine();
        System.out.println("");

        System.out.print("Empieza el juego. ¿Cúal crees que es el número correcto? Introduce un número del 1 al 10: ");
        numero = sc.nextInt();
        sc.nextLine();

    }

    @Override
    public void desarrollo() {

        //CON EL MATH.CEIL DELANTE DEL MATH.RANDOM EVITO QUE ME SALGA EL NÚMERO 0 QUE EN ESTE CASO NO ME HACE FALTA.
        aleatorio1 = (int) Math.ceil(Math.random() * 10);

        
            do {
                
            
            try {
                
            
            if (aleatorio1 == numero) {

                System.out.println("");
                System.out.println("Has acertado: ***********  " + nombre + "  ********** el número era " + aleatorio1
                        + " Felicidades........");
                repeticion = true;

            } else if (numero>10) {
                
                System.out.println("El número no es valido, por favor introduzca un número del 1 al 10");
                System.out.println("");
                System.out.print("Introduce un nuevo número del 1 al 10: ");
                numero = sc.nextInt();
                repeticion = false;
            
            } else {

                System.out.println("");
                System.out.println("El número: " + numero + " no es correcto, siga intentándolo.");
                System.out.println("");
                System.out.print("Introduce un nuevo número del 1 al 10: ");
                //USO INTENTO PARA CONTAR CUANTAS VECES INTRODUCE EL NÚMERO.
                intento++;
                numero = sc.nextInt();
                repeticion = false;

            }
            //UTILIZO EL TRY CATCH PARA SI INTRODUCEN UNA LETRA NO DE ERROR EL PROGRAMA. 
            }catch (InputMismatchException e){
                System.out.println("El dato introducido no es correcto SÓLO SE PERMITEN NÚMEROS DEL 1 AL 10.");
                sc.next();
            } 
        } while (!repeticion);
         

    }

    @Override
    public void fin() {

        System.out.println("");
        System.out.println(" El juego a terminado, has necesitado " + intento + " intentos para adivinar el número. "
                + "Gracias por participar........");
        System.out.println("");
        sc.nextLine();
        System.out.println("Presiona enter para continuar.....");
        sc.nextLine();
    }
}
