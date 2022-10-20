/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.sumanombres;

import java.util.Scanner;

/**
 *
 * @author ernes
 */
public class SumaNombres {

    public static void main(String[] args) {
        boolean mesGran = false;
        int numberUser = 0;
        int suma = 0;
        while (!mesGran) {
            System.out.println("Escriu un numero més gran que 10:");
            Scanner inputUser = new Scanner(System.in);
            numberUser = inputUser.nextInt();
            if (numberUser > 10) {
                mesGran = true;
            } else {
                System.out.println("EL NOMBRE ÉS MES PETIT O IGUAL A 10, HA D'INTRODUIR UN NOMBRE MAJOR A 10");
            }
        }

        for (int i = 0; i <= numberUser; i++) {
            suma += i;
        }

        System.out.println("El resultat de la suma és: " + suma);
    }
}
