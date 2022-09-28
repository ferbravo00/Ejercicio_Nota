/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_notas;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class Ejercicio_notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner (System.in);
        System.out.println("Introduce la nota del alumno: ");
        int nota = lectura.nextInt();
        
        while(nota<0 || nota>10){
            System.out.println("Introduzca una nota valida (0-10): ");
            nota = lectura.nextInt();
        }
        if(nota>=5 && nota<=6){
            System.out.println("HAS APROBADO!");
        }else if(nota>6 && nota<=7){
            System.out.println("BIENN!");
        }else if(nota>7 && nota<=9){
            System.out.println("UN NOTABLE!");
        }else if(nota>9){
            System.out.println("SOBRESALIENTE! :)");
        }else{
            System.out.println("HAS SUSPENDIDO :(!");
        }
    }
    
}
