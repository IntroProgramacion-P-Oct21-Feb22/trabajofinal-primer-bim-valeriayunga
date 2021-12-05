/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problem03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problem03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int tipo;
        double horas;
        double horas_extra;
        double extra;
        double cuota;
        double subtotal;
        double valorTotal;

        System.out.println("Ingresar el nombre del cliente");
        nombre = entrada.nextLine();

        System.out.println("Ingresar el tipo de cliente");
        tipo = entrada.nextInt();

        System.out.println("Ingresar las horas trabajadas");
        horas = entrada.nextDouble();

        System.out.println("Ingresar la cuota que se le paga por hora");
        cuota = entrada.nextDouble();

        System.out.println("Ingresar las horas extra");
        horas_extra = entrada.nextDouble();

        subtotal = horas * cuota;

        if (tipo == 1) {
            cuota = cuota * 1.5;
            extra = cuota * horas_extra;
            valorTotal = subtotal + extra;
        } else {

            if (tipo == 2) {
                cuota = cuota * 2;
                extra = cuota * horas_extra;
                valorTotal = subtotal + extra;
            } else {

                if (tipo== 3) {
                    cuota = cuota * 2.5;
                extra = cuota * horas_extra;
                valorTotal = subtotal + extra;
                } else {
                    
                    if (tipo == 4) {
                        cuota = cuota * 3;
                extra = cuota * horas_extra;
                valorTotal = subtotal + extra;
                    } else {
                         valorTotal = subtotal ;
                    }

                }
            }
        }
System.out.printf("Al empleado %s de tipo %d se le debe pagar: %.2f\n"
        ,nombre, tipo,valorTotal);
    }

}
