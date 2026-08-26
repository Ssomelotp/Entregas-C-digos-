//kevin santiago forero martinez & shara melo//
import java.util.Scanner;

public class Main { 

    // Variables estáticas
    static String nombre = "";
    static String telefono = "";
    static Double sueldo = 0.0;
    static String cargo = "";
    
    // Bandera para saber si existe usuario
    static boolean existeUsuario = false;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        mostrarMenu(teclado);
        teclado.close();
    }

    public static void mostrarMenu(Scanner teclado) {
        int opcion;

        System.out.println("\n-------BIENVENIDOOO-------");
        System.out.println("          MENU         ");
        System.out.println("1.Crear Usuario");
        System.out.println("2.Verificar usuario");
        System.out.println("3.Editar Usuario");
        System.out.println("4.Borrar Usuario");
        System.out.println("5.Terminar Proceso");
        System.out.print("seleccione una opcion: ");

        opcion = teclado.nextInt();
        teclado.nextLine(); 

        switch (opcion) {

            // 1. CREAR USUARIO
            case 1:
                if (existeUsuario) {
                    System.out.println("Ya existe un usuario registrado. Para modificar los datos, use la opcion 3 (Editar Usuario).");
                    System.out.println("presione Enter para volver al menu principal");
                    teclado.nextLine();
                } else {
                    System.out.println("Nombre:");
                    nombre = teclado.nextLine();

                    System.out.println("telefono:");
                    telefono = teclado.nextLine();

                    System.out.println("cargo:");
                    cargo = teclado.nextLine();

                    System.out.println("sueldo (ingrese sin puntos de miles, ej: 7000000):");
                    sueldo = teclado.nextDouble();
                    teclado.nextLine(); // Limpiamos el Enter

                    existeUsuario = true;
                    System.out.println("--> Usuario guardado exitosamente.");
                    System.out.println("presione Enter para volver al menu principal");
                    teclado.nextLine();
                }
                mostrarMenu(teclado);
                break;

            // 2. VERIFICAR USUARIO
            case 2:
                if (!existeUsuario) {
                    System.out.println("No hay ningun usuario registrado. Seleccione la opcion 1 para crear uno.");
                    System.out.println("presione Enter para volver al menu principal");
                    teclado.nextLine();
                } else {
                    System.out.println("Nombre:" + nombre);
                    System.out.println("telefono:" + telefono);
                    System.out.println("cargo:" + cargo);
                    System.out.println("sueldo:" + sueldo);
                    System.out.println("presione Enter para volver al menu principal");
                    teclado.nextLine();
                }
                mostrarMenu(teclado);
                break;

            // 3. EDITAR USUARIO
            case 3:
                if (!existeUsuario) {
                    System.out.println("No hay ningun usuario registrado para editar. Seleccione la opcion 1 para crear uno.");
                    System.out.println("presione Enter para volver al menu principal");
                    teclado.nextLine();
                } else {
                    System.out.println("Nombre:");
                    nombre = teclado.nextLine();

                    System.out.println("telefono:");
                    telefono = teclado.nextLine();

                    System.out.println("cargo:");
                    cargo = teclado.nextLine();

                    System.out.println("sueldo (ingrese sin puntos de miles, ej: 7000000):");
                    sueldo = teclado.nextDouble();
                    teclado.nextLine();

                    System.out.println("Usuario editado exitosamente.");
                    System.out.println("presione Enter para volver al menu principal");
                    teclado.nextLine();
                }
                mostrarMenu(teclado);
                break;

            // 4. BORRAR USUARIO
            case 4:
                if (!existeUsuario) {
                    System.out.println("No hay datos de usuario para borrar. Seleccione la opcion 1 para crear uno.");
                    System.out.println("presione Enter para volver al menu principal");
                    teclado.nextLine();
                } else {
                    nombre = "";
                    telefono = "";
                    cargo = "";
                    sueldo = 0.0;
                    existeUsuario = false;
                    System.out.println("Usuario borrado con exito.");
                    System.out.println("presione Enter para volver al menu principal");
                    teclado.nextLine();
                }
                mostrarMenu(teclado);
                break;

            // 5. TERMINAR PROCESO
            case 5:
                System.out.println("Programa terminado.");
                break;

            default:
                System.out.println("Opcion no valida.");
                System.out.println("presione Enter para volver al menu principal");
                teclado.nextLine();
                mostrarMenu(teclado);
                break;
        }
    }
}