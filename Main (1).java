import java.util.Scanner;

public class Main {

    public static String[] nombre = new String[100];
    public static float[] sueldo = new float[100];
    public static String[] cargo = new String[100];

    public static int cantidad = 0;

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
//se repite para siempre hasta que un break lo corte.
        for (int i = 0; i == 0; i = 0) {
            //nuestro menu
            System.out.println("\n╔══════════════════════════════════════════════╗");
            System.out.println("\n---------- MENU --------");
            System.out.println("1. Ingresar datos de un empleado");
            System.out.println("2. Leer datos del empleado");
            System.out.println("3. Editar datos empleado");
            System.out.println("4. Borrar datos empleado");
            System.out.println("5. Salir");
            System.out.print("Elija una opcion: ");
            System.out.println("\n╔══════════════════════════════════════════════╗");
//todas nuestras opciones del menu
            int opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) {
                escribir();
            }

            if (opcion == 2) {
                leerUno();
            }

            if (opcion == 3) {
                editar();
            }

            if (opcion == 4) {
                borrar();
            }

            if (opcion == 5) {
                System.out.println("Saliendo...");
                break;
            }
        }
    }

    // ---------- INGRESAR EMPLEADOS ----------
    public static void escribir() {
// el for que repite y va sumando amenos que decidan que no
        for (int i = cantidad; i < 100; i++) {

            System.out.println("\nEmpleado " + cantidad);

            System.out.print("Escriba el nombre: ");
            String nombreTemp = entrada.nextLine();

            System.out.print("Escriba el cargo: ");
            String cargoTemp = entrada.nextLine();

            System.out.print("Escriba el sueldo: ");
            float sueldoTemp = entrada.nextFloat();
            entrada.nextLine();
//funcion
            asignarValores(nombreTemp, cargoTemp, sueldoTemp, cantidad);

            cantidad++;

            System.out.print("Desea continuar registrando? (s/n): ");
            String continuar = entrada.nextLine();

            if (continuar.equalsIgnoreCase("n")) {
                break;
            }

            if (cantidad == 100) {
                System.out.println("No se pueden ingresar mas empleados.");
                break;
            }
        }
    }

    // ---------- LEER UN EMPLEADO ----------
    public static void leerUno() {

        System.out.print("Escriba el numero de empleado a consultar: ");
        int nro = entrada.nextInt();
        entrada.nextLine();
//verificaciones de existencia
        if (existeUsuario(nro)) {
            verDatos(nro);
        }

        if (!existeUsuario(nro)) {
            System.out.println("Ese empleado no existe.");
        }
    }

    // ---------- EDITAR ----------
    public static void editar() {

        System.out.print("Escriba el numero de empleado a editar: ");
        int nro = entrada.nextInt();
        entrada.nextLine();
//otras verificaciones de existencia  

    if (!existeUsuario(nro)) {
            System.out.println("Ese empleado no existe.");
        }

        if (existeUsuario(nro)) {

            System.out.println("\nEditando empleado " + nro);

            System.out.print("Nuevo nombre: ");
            String nombreTemp = entrada.nextLine();

            System.out.print("Nuevo cargo: ");
            String cargoTemp = entrada.nextLine();

            System.out.print("Nuevo sueldo: ");
            float sueldoTemp = entrada.nextFloat();
            entrada.nextLine();
//funcion
            asignarValores(nombreTemp, cargoTemp, sueldoTemp, nro);

            System.out.println("Empleado actualizado.");
        }
    }

    // ---------- BORRAR ----------
    public static void borrar() {

        System.out.print("Escriba el numero de empleado a borrar: ");
        int nro = entrada.nextInt();
        entrada.nextLine();

        if (!existeUsuario(nro)) {
            System.out.println("Ese empleado no existe.");
        }

        if (existeUsuario(nro)) {
//borramos los datos de nuestras variables 
            nombre[nro] = "";
            cargo[nro] = "";
            sueldo[nro] = 0;

            System.out.println("Empleado borrado.");
        }
    }

    // evitamos que alguien intente leer/editar/borrar un empleado que nunca se registro
    public static boolean existeUsuario(int nro) {

        if (nro < 0) {
            return false;
        }

        if (nro >= cantidad) {
            return false;
        }

        return true;
    }

    // nuestras variables y asignamos los datos 
    public static void asignarValores(
            String name,
            String position,
            float rate,
            int nroEmpleado) {

        nombre[nroEmpleado] = name;
        cargo[nroEmpleado] = position;
        sueldo[nroEmpleado] = rate;
    }

    // mostramos los datos 
    public static void verDatos(int nroEmpleado) {

        System.out.println("\n----- DATOS DEL EMPLEADO -----");
        System.out.println("Nombre: " + nombre[nroEmpleado]);
        System.out.println("Cargo: " + cargo[nroEmpleado]);
        System.out.println("Sueldo: " + sueldo[nroEmpleado]);
    }
}