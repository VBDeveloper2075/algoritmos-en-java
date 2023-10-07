// Escribe un programa que pida al usuario un numero y devuelva todos los números desde 0 hasta
// ese número.

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {

        int tuNumber;
        Scanner holi = new Scanner(System.in);

        System.out.print("--------------- BIENVENIDO AL CONTADOR DE NUMEROS ---------------\n");
        System.out.print("Ingrese un numero: ");
        tuNumber = holi.nextInt();

        for (int i = 0; i <= tuNumber; i++) {
            System.out.println("este numero está antes que el tuyo:  " + i);
        }

    }
}
