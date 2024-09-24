/**
 *@author Francisco Javier Hernandez Ballona
 *@since 17-12-2020
 */
// Fig 3.1: Cuenta.java
// Clase cuenta que contiene una variable de distancia llamada nombre
// y  metodos para establecer y obtener su valor

public class Cuenta
{
    private String nombre; // variable de instancia (atributo)

    public void establecerNombre(String nombre)
    {
        this.nombre = nombre; // almacenar el nombre
    }

    public String obtenerNombre()
    {
        return nombre;//devuelve el valor de nombre
    }


 }//fin de la clase Cuenta{