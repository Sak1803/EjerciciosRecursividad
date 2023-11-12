package ejercicios;
import java.util.Scanner;

public class Fibonacci {

    public static void Resolver(int actual, int limite, int anterior, int suma) {
        if (actual < limite) {
            int F = Fibonacci(actual);
            if (actual > 0) {
                System.out.println(anterior + " + " + F + " = " + (anterior + F));
                Resolver(actual + 1, limite, F, suma + F);
            } else { 
                System.out.println(F);
                Resolver(actual + 1, limite, F, F);
            }
        }
    }
    public static int Fibonacci(int actual) {
        if (actual <= 1) {
            return actual;
        } else {
            return Fibonacci(actual - 1) + Fibonacci(actual - 2);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la posición de la secuencia Fibonacci que deseas conocer: ");
        int F = scanner.nextInt();
        Resolver(0, F, 0, 0);
    }
}


