/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubrica32.ing;

import java.util.Scanner;

/**
 *
 * @author Jorge Mero
 */
public class Rubrica32Ing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     int valor1=0;//Deglaro mi variable para mi primer valor // int significa que mi variable es entera
     int valor2=0;//Declaro mi variable para mi segundo valor 
     int suma=0;//declaro la variable de mi suma ; esta acumula la operaciòn de mi suma con valor1 + valor2
    Scanner entrada= new Scanner(System.in);//En la variable entrada puedo colocar otras variable como; mientrada, ingreso, teclado etc..
    System.out.println("Ingrese el primer valor =>");
    valor1=entrada.nextInt();
    System.out.println("Ingrese el segundo valor =>");
    valor2=entrada.nextInt();
    suma=valor1+valor2;
    // System.out.printf("La suma %d \n",suma); // f es para mostrar algo pero en formato
    System.out.printf("La suma %d más %d es igual ===> %d\n",valor1,valor2,suma);// puedo mostra mi mensaje de esta manera o tambien como de la forma anterior
                                                                                // Este %d es como significara valor1 y el otro %d es valor2 y de ultimo la palabra sera la suma
                                                                               // con esta barra puedo escribir comentario que me ayuden a recordar lo que se realizo en cada programa 
                                                                              // es decir que estos comentarios no se van a ejecutar (ni mostrar) en mi programa  
   }
    }
    
}
