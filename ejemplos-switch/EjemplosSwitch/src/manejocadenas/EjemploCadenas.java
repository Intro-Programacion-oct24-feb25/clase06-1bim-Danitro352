/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        System.out.printf("%s\n", ciudad.toLowerCase());//no cambia el valor de la variable, solo se imprime lo que pide
        // System.out.printf("%s\n", ciudad.toUpperCase());
        System.out.printf("%s\n", ciudad);//se presenta el valor de toUpperCase ya que la varaible ciudad tiene ese valor
        // toLowerCase es un método, sirve para poner minusculas al valor de la variable
        // toUpperCase es un método, tambien sirve para poner en mayusculas al valor de la variable
        
        
    }
}
