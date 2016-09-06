/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica32.ing;

import java.util.Scanner;

/**
 *Descripción: Resta Dos Números
 * @author Jorge Mero
 */
public class Rubrica32Ing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
  Scanner teclado=new Scanner(System.in);
    int valor1=0;
    int valor2=0;
    int resta=0;
    System.out.print("Ingrese el primer valor ==> ");
    valor1=teclado.nextInt();
    System.out.print("Ingrese el segundo valor ==> ");
    valor2=teclado.nextInt();
    resta=valor1-valor2;
    System.out.println("la resta es ==> "+resta);
     }
   }

