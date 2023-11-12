package ejercicios;
import java.util.Scanner;

public class SumaRecursiva {
    public static int SumaR (int n, int m){ 
        if (m == 1){ 
            System.out.print("("+n+")"); 
            return n;  
        }
        else{
            int Auxn = n + SumaR(n ,m-1);
            System.out.print("-->" + "("+Auxn+")" ); 
            return Auxn; 
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt(); 
        System.out.print("Ingresa la cantidad de veces a sumar: ");
        int m = scanner.nextInt();   
        System.out.println(""); 
        System.out.println("\nLa suma del numero " + n + " sumado " + m + " veces es: " + SumaR(n,m));   
    }
}
