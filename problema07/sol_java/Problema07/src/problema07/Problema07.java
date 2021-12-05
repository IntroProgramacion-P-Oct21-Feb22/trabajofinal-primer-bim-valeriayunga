/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema07;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int par_ingresado;
        int contador = 2;
        int numero = 2;
        
        System.out.println("Ingrese un número par mayor a 2");
            par_ingresado = entrada.nextInt();
        
        if (par_ingresado < 2){
            System.out.println("valor erroneo");
        }else{
            while (numero < par_ingresado){
                numero = numero + contador;
            }
        }
        System.out.printf("La suma par es: %d\n",numero);
    }
    
}
