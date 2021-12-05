/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double x;
        double y;
        String cuadrante ="";

        System.out.println("Ingresar el punto x");
        x = entrada.nextDouble();

        System.out.println("Ingresar el punto y");
        y = entrada.nextDouble();

        if (x >= 0 & y >= 0) {
            cuadrante = "1er Cuadrante";
        } else {

            if (x <= 0 & y >= 0) {
                cuadrante = "2do Cuadrante";
            } else {

                if (x <= 0 & y <= 0) {
                    cuadrante = "3er Cuadrante";

                } else {
                    if (x >= 0 & y <= 0) {
                        cuadrante = "4to Cuadrante";
                    } else {
                        if (x == 0 & y == 0) {
                        cuadrante = "no pertenece a ningún cuadrante";
                        }
                    }

                }
            }
        }

        System.out.printf("La coordenada: (%.2f ; %.2f) está ubicada en el "
                + "%s\n",
                 x, y, cuadrante);
    }

}
