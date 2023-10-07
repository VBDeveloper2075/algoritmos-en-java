//Escribe un programa que pida al usuario un número y muestre la tabla de
//multiplicar de ese número del 1 al 10.
//el formato debe ser:
//1 x 1 = 1
//1 x 2 = 2
//1 x 3 = 3

import java.util.Scanner;
public class Tablamultiplicar {
    public static void main (String[] args){
        int tuNumero, resultado;
        Scanner scaner = new Scanner(System.in);

        System.out.println("---------- Que Tabla de Multiplicar querés Hoy? ----------");
        System.out.println("Escribe un Numero :     ");
        tuNumero = scaner.nextInt();
        System.out.println("------ TU TABLA DE MULTIPLICAR -------");

        for(int i= 0; i< 11; i++){
            resultado = i*tuNumero;
            System.out.println(i + "x " + tuNumero + " =  " + resultado);
        }
    }
}
