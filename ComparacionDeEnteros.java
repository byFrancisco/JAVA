import java.util.Scanner;

/**
 * @author Francisco Javier Hernandez Ballona
 * @version 1.0
 * @since 2020-11-28
 **/

public class ComparacionDeEnteros
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        int numero1; // primer numero a comparar
        int numero2; // segundo numero a comparar

        System.out.print("Escribe el primer numero entero: "); // indicador
        numero1 = entrada.nextInt(); // lee el primer numero del usuario

        System.out.print("Escribe el segundo entero: "); // indicador
        numero2 = entrada.nextInt(); // lee el segundo numero del usuario

        if (numero1 == numero2)
            System.out.println("Estos numeros son iguales");


        if (numero1 < numero2)
            System.out.printf("el numero %d\n es mas grande que el %d\n",numero1,numero2);

        if (numero1 > numero2)
            System.out.printf("el numero: %d , es mas grande que el: %d",numero1,numero2);










     




    } // fin del metodo main
} // fin de la comparacion