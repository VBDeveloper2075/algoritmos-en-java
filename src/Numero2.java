
import java.util.Scanner;
public class Numero2 {

    public static void main(String[] args) {
        int tuNumber;
        Scanner holi = new Scanner(System.in);
        System.out.print("--------------- BIENVENIDO AL CONTADOR DE NUMEROS ---------------");

        do{
        System.out.print("Ingrese un numero(de 0 al 100):  ");
        tuNumber = holi.nextInt();

            if(tuNumber < 0 || tuNumber > 100) {
                System.out.println("El numero ingresado es invalido, por favor ingrese otro que cumpla con la consigna: ");
            }
        }while(tuNumber <0 || tuNumber > 100);

    }
}
