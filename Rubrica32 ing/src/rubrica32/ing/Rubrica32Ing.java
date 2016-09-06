/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica32.ing;

import java.util.Scanner;

/**
 * Descripción:  División Dos Números
 * @author Jorge Mero
 */
public class Rubrica32Ing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada=new Scanner(System.in);
            double valor1=0;  //Uso la variable double esta me permitira mostra 2 decimales de la operaciòn 
            double valor2=0;
            double division=0.0;
            System.out.println("Ingrese el primer valor");
            valor1=entrada.nextInt();
            System.out.println("Ingrese le segundo valor");
            valor2=entrada.nextInt();
            division=valor1/valor2;
            System.out.println("El resultado es ="+division);
            
    }
   }

