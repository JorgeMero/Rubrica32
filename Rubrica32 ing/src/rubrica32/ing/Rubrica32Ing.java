/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica32.ing;

import java.util.Scanner;

/**
 * Descripción: Múltiplicar Dos Números
 * @author Jorge Mero
 */
public class Rubrica32Ing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada=new Scanner(System.in);
        int valor1=0;
        int valor2=0;
        int producto=0;
        System.out.println("Ingrese el primer valor");
        valor1= entrada.nextInt();
        System.out.println("Ingrese el segundo valor");
        valor2=entrada.nextInt();
        producto=valor1*valor2;
        System.out.printf("El producto de %d por %d es igual a %d\n ",valor1,valor2,producto); 
     }
   }

