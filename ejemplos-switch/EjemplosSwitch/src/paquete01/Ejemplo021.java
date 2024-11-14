/*
Ingrese fecha de nacimiento 

Día: 7 
Mes: 2
Año: 1980

Salida 

Usted ha nacido el 7 de FEBRERO de 1980

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.println("Ingrese el dia de nacimiento");
        int dia = entrada.nextInt();
        
        System.out.println("Ingrese el mes de nacimiento");
        int mes = entrada.nextInt();
        
        System.out.println("Ingrese el año de nacimiento");
        int year = entrada.nextInt();
        
        String mesCadena = " ";

        switch (mes) {
            case 1:
                mesCadena = "enero";
               break;
                       
            case 2:
                mesCadena = "febrero";
                break;
            
            case 3:
                mesCadena = "marzo";
                break;            
                
            case 4:
                mesCadena = "abril";
                break;
                        
            case 5:
                mesCadena = "mayo";
                break;   
             
            case 6:
                mesCadena = "junio";
                break;
            
            case 7:
                mesCadena = "julio";
                break;    
            
            case 8:
                mesCadena = "agosto";
                break;
                   
            case 9:
                mesCadena = "septiembre";
                break;
             
            case 10:
                mesCadena = "octubre";
                break; 
                
            case 11:
                mesCadena = "noviembre";
                break;
                
            case 12:
                mesCadena = "diciembre";
                break;
                
            default:
                System.out.println("Opción incorrecta");
                break;
        }
     mesCadena = mesCadena.toUpperCase();
     
     System.out.printf("Usted ha nacido el %d de %s de %d",
             dia,
             mesCadena,
             year);

    }
}
