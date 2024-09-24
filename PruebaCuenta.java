/** clase cuenta
 *@author Francisco Javier Hernandez Ballona
 *@since 17-12-2020
 */

// Fig 3.2: PruebaCuenta.java
// Crear y manipular un objeto Cuenta

import java.util.Scanner;

public class PruebaCuenta
{
    public static void main(String[] args)
    {
        //crea un objetocuents y lo asigna a mi cuenta
        Scanner entrada = new Scanner(System.in);

        // crea un objeto cuenta y lo asigna a miCuenta
        Cuenta miCuenta = new Cuenta();

        //muestra el valor inicial del nombre (null)
        System.out.printf("El nombre inicial es: %s%n%n",miCuenta.obtenerNombre());

        //pide y lee el nombre
        System.out.println("Introduzca el nombre:");
        String elNombre = entrada.nextLine(); //lee una linea de texto
        miCuenta.establecerNombre(elNombre); //coloc el nombre en miCuenta
        System.out.println();

        // muestra el nombre almacenado en el objeto miCuenta
        System.out.printf("El nombre en el objeto miCuenta es: %n%s%n",miCuenta.obtenerNombre());
    }
}