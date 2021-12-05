/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probblema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Probblema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String tipo_angulo = "";
        double angulo_A;
        double angulo_B;
        double angulo_C;

        System.out.println("Ingrese el ángulo A");
        angulo_A = entrada.nextDouble();

        System.out.println("Ingrese el ángulo B");
        angulo_B = entrada.nextDouble();

        System.out.println("Ingrese el ángulo C");
        angulo_C = entrada.nextDouble();

        if ((angulo_A == 90) || (angulo_B == 90) || (angulo_B == 90)) {
            tipo_angulo = "rectángulo";

        } else {

            if ((angulo_A > 90 & angulo_A < 180) || (angulo_B > 90
                    & angulo_B < 180) || (angulo_C > 90 & angulo_C < 180)) {
                tipo_angulo = "obtusángulo";
            } else {

                if ((angulo_A < 90) & (angulo_B < 90) & (angulo_B < 90)) {
                    tipo_angulo = "acutángulo";
                } else {
                   
                     System.out.println("Ángulo incorrecto");

                }
            }
            
             
        }
        System.out.printf("El tipo de triángulo es:%s \n", tipo_angulo);
    }

}
