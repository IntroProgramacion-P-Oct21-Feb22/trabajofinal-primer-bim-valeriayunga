/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema09;

/**
 *
 * @author Usuario
 */
public class Problema09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
       int limite = 44;
       int numero1 = 12;
       int numero2 = 11;
       int contador1 = 0;
       int contador2 = 0;
       int suma = 1;
       String cadena = "S1 = ";
       
       do {
         contador1= contador1 +1;
         contador2= contador2 +1;
         numero1 = numero1*contador1;
         numero2 = numero2*contador2;
         
       cadena = String.format("%s%d - %d + ",cadena,numero1, numero2);
       
       suma = numero1 + numero2;
        
        
       } while (numero2 <= limite);
       
        System.out.printf("%s\n\n%d",cadena,suma);
    }
    
}
