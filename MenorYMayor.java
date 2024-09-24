/**
 *@author Francisco Javier Hernandez Ballona
 *@version 1.0
 *@since 2020-11-29
 **/
//Recibe tres numeros enteros del usuario, muestra la suma,promedio, producto,menor y mayor de esos numeros
import java.util.Scanner;

public class MenorYMayor
{
    public static void main(String [] args)
    {
        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int suma;
        int promedio;
        int producto;

        System.out.print("Ingressa el primer numero entero: ");
        numero1 = entrada.nextInt();

        System.out.print("Ingresa el segundo numero entero: ");
        numero2 = entrada.nextInt();

        System.out.print("Ingresa el tercer numero entero: ");
        numero3 = entrada.nextInt();

        suma = numero1 + numero2 + numero3;

        promedio = suma/3;

        producto = numero1 * numero2 * numero3;

        System.out.printf("la suma es %d", suma);

        System.out.printf("El promedio es %d",promedio);

        System.out.printf("El producto es %d",producto);

        if (numero1 > numero2);
        if (numero1 > numero3);
        System.out.printf("El numero mayor es %d",numero1);

        if(numero2 > numero1);
        if(numero2 > numero3);
        System.out.printf("El numero mayor es %d",numero2);

        if(numero3 > numero1);
        if(numero3 > numero2);
        System.out.printf("El numero mayor es %d",numero3);

        if(numero1 < numero2);
        if(numero1 < numero3);
        System.out.printf("El numero menor es %d",numero1);

        if(numero2 < numero1);
        if(numero2 < numero3);
        System.out.printf("El numero menor es %d",numero2);

        if(numero3 < numero1);
        if(numero3 < numero2);
        System.out.printf("El numero menor es %d",numero3);

        if(numero1 == numero2);
        if(numero2 == numero3);
        if(numero3 == numero1);
        System.out.printf("los numeros son iguales %d");
    } // Fin del metodo main
} // Fin de la clase