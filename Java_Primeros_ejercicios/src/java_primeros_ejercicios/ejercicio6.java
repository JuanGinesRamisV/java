/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_primeros_ejercicios;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class ejercicio6 {
    public static void main(String[] args) {
        int numeros[]= new int [12];
        int numeros1[]=new int [12];
        int numerosfinal[]=new int[24];
        Scanner scanner= new Scanner(System.in);
        int i;
        int aux=0;
        System.out.println("introduce los 12 primeros numeros");
        for(i=0;i<numeros.length;i++){
            numeros[i]=scanner.nextInt();
        }
        System.out.println("Introduce los 12 ultimos numeros");
        for(i=0;i<numeros1.length;i++){
            numeros1[i]=scanner.nextInt();
        }
        for(i=0;i<numeros.length;i=i+3){
            System.out.println(i);
        }
    }
}
