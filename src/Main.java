import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = scan.nextInt();

        for (int contador = 1; contador <= 12; contador++){
            int producto = numero * contador;
            System.out.println(numero + " * " + contador + " = " + producto);
        }
    }
}