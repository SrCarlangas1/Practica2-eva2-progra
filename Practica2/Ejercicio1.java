/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica2;

import java.util.Scanner;

/**
 *
 * @author infor12
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] matriz= new int [5][5];
        
        for(int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                System.out.print(matriz[i][j]=i+j);
            }
            System.out.println("");
        }
    }
                        
}



        
        