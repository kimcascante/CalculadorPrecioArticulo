package Adicional;

/**
 * Nombre del programa: 
 * Descripcion: Se trata de calcular el precio de un artículo al cual se le hace un descuento 
    dependiendo del cliente. Si el cliente es normal se le hace un 5% de descuento, pero si el 
    cliente es frecuente se le hace un 10% de descuento.
 * Autor: Kimberly C.
 * Fecha de creacion:
 * Modificado por:
 * fecha de modificacion:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ejp2w2 {
    public static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    public static PrintStream escribir = System.out;

    public static void main(String[] args) throws IOException{ 
        double precioArticulo;
        double clienteNormal = 0.05;
        double clienteFrecuente = 0.1;
        String tipoCliente;
        double porPagar;

        escribir.println("Digite el precio del articulo:");
        precioArticulo = Double.parseDouble(leer.readLine());

        escribir.println("Digite el tipo de cliente, 'Normal' o 'Frecuente':");
        tipoCliente = leer.readLine();

        if (tipoCliente.equalsIgnoreCase("Frecuente")){
            porPagar = precioArticulo - (precioArticulo * clienteFrecuente);
        } else {
            porPagar = precioArticulo - (precioArticulo * clienteNormal);
        }

        escribir.println("El precio por pagar por el producto es de " +porPagar+ " colones");

    }
}