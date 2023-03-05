import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int[] inicializarTabla(int limiteMinimo, int limiteMaximo) {
        int[] tabla = new int[10];
        Random rand = new Random();
        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = rand.nextInt(limiteMaximo - limiteMinimo + 1) + limiteMinimo;
        }
        return tabla;
    }

    public static int mayorValor(int[] tabla) {
        int max = tabla[0];
        for (int i = 1; i < tabla.length; i++) {
            if (tabla[i] > max) {
                max = tabla[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el límite mínimo y máximo de la tabla:");
        int limiteMinimo = teclado.nextInt();
        int limiteMaximo = teclado.nextInt();

        int[] tabla = inicializarTabla(limiteMinimo, limiteMaximo);
        System.out.println("Tabla inicializada aleatoriamente:");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();
        int mayor = mayorValor(tabla);
        System.out.println("El mayor valor de la tabla es: " + mayor);
    }
}