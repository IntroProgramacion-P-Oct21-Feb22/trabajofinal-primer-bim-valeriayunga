/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double cantidad;
        double precio = 10;
        double descuento =0;
        double porcentaje1 = 20;
        double porcentaje2 =25;
        double porcentaje3=40;
        double porcentaje4=50;
        double subtotal;
        double valor_Total=0;
        
        System.out.println("Ingresar el número de tajes que se comprarán");
        cantidad = entrada.nextDouble();
        
        subtotal = (cantidad * precio);
        
         if (cantidad == 1) {
                descuento = (porcentaje1 * subtotal) / 100;
                valor_Total = subtotal - descuento;
            } else {

                if (cantidad == 2) {
                    descuento = (porcentaje2 * subtotal) / 100;
                    valor_Total = subtotal - descuento;
                } else {

                    if (cantidad == 3) {
                        descuento = (porcentaje3 * subtotal) / 100;
                        valor_Total = subtotal - descuento;

                    } else {
                        if (cantidad > 3) {
                            descuento = (porcentaje4 * subtotal) / 100;
                            valor_Total = subtotal - descuento;
                        } else {
                            System.out.println("Valor incorrecto");
                        }

                    }
                }
            }

         System.out.printf("El subtotal por pagar es: %.2f,\nEl descuento es :"
                 + "%.2f\nEl total a pagar es: %.2f",
                 subtotal,descuento,valor_Total);
         
         
    }
    
}
