/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package leer_numero;
import java.util.Scanner;
/**
 *
 * @author jona
 */

 
public class Prueba {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        TareasProgramacion NumLetra = new TareasProgramacion();
        
            System.out.println("Escribe un número entero: ");
            String n = s.nextLine();
            System.out.println(NumLetra.Convertir(n));
    }
}
