package Practica2;

import java.util.Scanner;

/**
*
* @author Ariel
*/
public class Ejercicio3 {
   public static void main(String[] args) {
       int[][] numUno = new int[3][3];
       int[][] numDos = new int[3][3];
       Scanner numero = new Scanner(System.in);
       System.out.println("Cargando Tabla Uno.");
       for (int i = 0; i < numUno.length; i++) {//Dimensión Uno.
           for (int j = 0; j < numUno.length; j++) {//Dimensión Dos.
               System.out.print("["+i+"]"+"["+j+"]"+"=");
               numUno[i][j]=numero.nextInt();             
           }           
       }
       System.out.println("Cargando Tabla Dos.");
       for (int i = 0; i < numDos.length; i++) {//Dimensión Uno.
           for (int j = 0; j < numDos.length; j++) {//Dimensión Dos.
               System.out.print("["+i+"]"+"["+j+"]"+"="); 
               numDos[i][j]=numero.nextInt();             
           }           
       }
       System.out.println("Imprimiendo Tabla Uno.");
       for (int i = 0; i < numUno.length; i++) {
           System.out.println();
           for (int j = 0; j < numUno.length; j++) {
                 System.out.print(numUno[i][j] + " ");             
           }           
       }
       System.out.println("\nImprimiendo Tabla Dos.");
       for (int i = 0; i < numDos.length; i++) {
           System.out.println();
           for (int j = 0; j < numDos.length; j++) {
                 System.out.print(numDos[i][j] + " ");             
           }           
       }
       int[][] suma = new int[3][3];
       System.out.println("\nSumando las dos Tablas.");
       for (int i = 0; i < suma.length; i++) {
           for (int j = 0; j < suma.length; j++) {
                 suma[i][j]=  numUno[i][j] + numDos[i][j];           
           }           
       }
       System.out.println("\nImprimiendo Suma.");
       for (int i = 0; i < suma.length; i++) {
           System.out.println();
           for (int j = 0; j < suma.length; j++) {
                 System.out.print(suma[i][j] + " ");             
           }           
       }
   }
}
