import java.util.Scanner;

public class Main {
   
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Esta variable va a guardar el numero que el usuario elige en el menu principal.
        int opcionPrincipal;

        do {
            // El metodo "menu" se encarga de preguntar y de asegurarse  de que el numero elegido sea valido (entre 1 y 3).
            opcionPrincipal = menu(
                    "1- Area\n2- Volumen\n3- Salir\n",
                    3
            );

        
            switch (opcionPrincipal) {

                case 1:
                    procesarAreas();
                    break;

                case 2:
                    procesarVolumenes();
                    break;

                case 3:
                    System.out.println("\n(^_^)/  Gracias por usar el programa. ¡Hasta pronto!  \\(^_^)");
                    break;
            }

        } while (opcionPrincipal != 3);
        // "sigue repitiendo el menu
        //mientras la opcion elegida no sea 3".

        scanner.close();
    }

    public static void encabezado() {
        System.out.println("\n╔══════════════════════════════════════════════╗");
        System.out.println("║     CALCULADORA DE ÁREAS Y VOLÚMENES      ║");
        System.out.println("╚══════════════════════════════════════════════╝");
    }

    
    public static int menu(String texto, int nroOpciones) {

        // Aqui vamos a guardar lo que el usuario responda.
        int opcion;

     
        do {
            encabezado();

            System.out.println("┌─────────────────────────────┐");
            System.out.println(texto);
            System.out.println("└─────────────────────────────┘");
            System.out.print("  Digite su opción: ");

        
            opcion = scanner.nextInt();

        } while (opcion < 1 || opcion > nroOpciones);
        
        return opcion;
    }

    // ==================== MENU DE AREAS ====================

    public static void procesarAreas() {

        // Guardamos aqui la opcion elegida dentro de este sub-menu
        int opcion;

        do {

            opcion = menu(
                    " 1- Cuadrado\n" +
                    " 2- Triangulo\n" +
                    " 3- Circulo\n" +
                    " 4- Hexagono\n" +
                    " 5- Volver\n",
                    5
            );

            switch (opcion) {

                case 1:
                    calcularAreaCuadrado();
                    break;

                case 2:
                    calcularAreaTriangulo();
                    break;

                case 3:
                    calcularAreaCirculo();
                    break;

                case 4:
                    calcularAreaHexagono();
                    break;

                case 5:
                    // El usuario quiere regresar al menu principal.
                    System.out.println(" Regresando al menú principal...");
                    break;
            }

        } while (opcion != 5);
    }

    // ==================== MENU DE VOLUMENES ====================

    public static void procesarVolumenes() {

        int opcion;

        do {

            opcion = menu(
                    " 1- Cubo\n" +
                    " 2- Cilindro\n" +
                    " 3- Esfera\n" +
                    " 4- Volver\n",
                    4
            );

            switch (opcion) {

                case 1:
                    calcularVolumenCubo();
                    break;

                case 2:
                    calcularVolumenCilindro();
                    break;

                case 3:
                    calcularVolumenEsfera();
                    break;

                case 4:
                    System.out.println(" Regresando al menú principal...");
                    break;
            }

        } while (opcion != 4);
    }

    // ==================== FUNCIONES GENERALES ====================
  
    /*En esta parte la lógica de solicitud y captura de un valor de tipo
 double evita duplicar las instrucciones "System.out.print"
 y "scanner.nextDouble()" en cada método que requiere leer un
 dato geométrico (lado, radio, altura, base, etc.)
    */
    public static double leerDato(String mensaje) {

        System.out.print(mensaje);

        return scanner.nextDouble();
    }

    public static void mostrarResultado(String figura, double resultado) {
        System.out.println("\n ¡Listo! El resultado para " + figura +
                           " es: " + resultado);
    }

    // ==================== AREAS ====================

    // Calcula el area de un cuadrado
    // Formula: lado x lado
    public static void calcularAreaCuadrado() {

        double lado = leerDato("Digite el lado: ");

        double area = lado * lado;

        mostrarResultado("el cuadrado", area);
    }

    // Calcula el area de un triangulo
    // Formula: (base x altura) / 2
    public static void calcularAreaTriangulo() {

        double base = leerDato("Digite la base: ");
        double altura = leerDato("Digite la altura: ");

        double area = (base * altura) / 2;

        mostrarResultado("el triangulo", area);
    }

   
    // Formula: PI x radio x radio 
    public static void calcularAreaCirculo() {

        double radio = leerDato("Digite el radio: ");

        double area = Math.PI * radio * radio;

        mostrarResultado("el circulo", area);
    }

    // Calcula el area de un hexagono regular
    public static void calcularAreaHexagono() {

        double lado = leerDato("Digite el lado: ");

        double area = (3 * Math.sqrt(3) * lado * lado) / 2;

        mostrarResultado("el hexagono", area);
    }

    // ==================== VOLUMENES ====================

 
    // Formula: lado x lado x lado.
    public static void calcularVolumenCubo() {

        double lado = leerDato("Digite el lado: ");

        double volumen = lado * lado * lado;

        mostrarResultado("el cubo", volumen);
    }

    
    // Formula: PI x radio x radio x altura.
    public static void calcularVolumenCilindro() {

        double radio = leerDato("Digite el radio: ");
        double altura = leerDato("Digite la altura: ");

        double volumen = Math.PI * radio * radio * altura;

        mostrarResultado("el cilindro", volumen);
    }

    // Formula: (4/3) x PI x radio x radio x radio.
    public static void calcularVolumenEsfera() {

        double radio = leerDato("Digite el radio: ");

        double volumen = (4.0 / 3.0) * Math.PI * radio * radio * radio;

        mostrarResultado("la esfera", volumen);
    }
}
