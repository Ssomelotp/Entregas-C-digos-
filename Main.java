/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner teclado = new Scanner (System.in);
	    int opcion = 0;
	    float saldo = 0;
	    
	    while (opcion != 4){
	        System.out.println("--------Banco de la Republica--------");
	        System.out.println("(1): Depositar");
	        System.out.println("(2): Retirar ");
	        System.out.println("(3): Ver Saldo ");
	        System.out.println("(4): Terminar ");
	        opcion = teclado.nextInt();
	   switch(opcion){
	       case 1:
	           System.out.println("------- Depositar -------");
	           System.out.println("¿Cuanto deseas depositar?");
	           saldo += teclado.nextFloat();
	           System.out.println("se deposito correctamente :D");
	           break;
	       case 2 : 
	           System.out.println("--------Retirar------");
	           System.out.println("¿Cuanto desea retirar?");
	           float retiro = teclado.nextFloat();
	           if (retiro >  0 && retiro <= saldo) {
	               saldo -= retiro;
	           }
	           
	           else {
	               System.out.println("Saldo insuficiente D:");
	               break;
	           }
	           case 3 :
	               System.out.println("------Saldo-------");
	               System.out.println("Tu saldo es:" + saldo );
	               break;
	           case 4 : 
	               System.out.println("Proceso terminado");
	               break;
	           default:
	           System.out.println("Opcion no valida");
	           }
	           }
	           
	           
	       
	           
	           
	   }
	    }
		


