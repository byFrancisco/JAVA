/**
 * @author Francisco Javier Hernandez Ballona
 * @version 1.0
 * @since 2020-12-03
 */
import java.util.Scanner;
public class EstructuraIfElse{
    /* metodo constructor
    *REGLAS
    * El nombre del metodo constructor sera el mismo que el nombre de la clase
    * Metodo publico sin valor de retorno
     */

    public EstructuraIfElse(){

    }
    // metodo main
    public static void main(String[] args){
        String nombre;
        int cali1;
        int cali2;
        int cali3;
        float promedio;

        Scanner entrada= new Scanner(System.in);

        System.out.println("Da el nombre");
        nombre = entrada.nextLine(); // guarda palabras

        System.out.println("Da la calificacion 1");
        cali1 =entrada.nextInt();

        System.out.println("Da la calificacion 2");
        cali2 = entrada.nextInt();

        System.out.println("Da la califiacion 3");
        cali3 = entrada.nextInt();

        promedio =(cali1 + cali2 + cali3)/3;

        if(promedio >=70){
            System.out.println("El alumno" + nombre + "esta aprobado");

        }
        else{
            System.out.println("El alumno "+ nombre +"esta reprobado");
        }
    }
}