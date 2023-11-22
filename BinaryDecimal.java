/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarydecimal;

// Java Program to convert from decimal to binario

//Programa Java para pasar de decimal a binario

//this program reads an integer number that id given by the final user and it shows its value in the binary numeric system (0,1)

//el programa lee un número entero que se le pide al usuario y muestra su valor en sistema binario(0,1)


/**
 *
 * @author Anthony Abril
 */


import java.util.Scanner;

public class BinaryDecimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=0;   //elimino el entero i ya que no se llega a utilizar asi que no es necesario
        do {
        System.out.print("Introduzca un número que sea mayor que 0: ");                                                           
            n = sc.nextInt();
        } while (n <= 0);//ejecutaba el bucle mientras i fuese 0 cuando en el bucle introducimos el valor en n

        System.out.print("\nBinario: ");
        decBin(n);//llamaba a la funcion decBinario cuando se llama decBin
    }

  
    //Método para pasar de decimal a binario
    public static void decBin(int n) {
        if (n < 2) {//no puede escribir n si es igual a 2 ya que solo puede escribir 1 o 0
            System.out.print(n);
        } else {
            decBin(n / 2);
            System.out.print(n % 2);//utilizamos n%2 en vez de n^2 ya que lo que queremos escribir es el resto de la division
        }
    }
}
