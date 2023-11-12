package ejercicios;
import java.util.Scanner; 
public class FactorialAndPotenciacion {
    public static double CalcularFactorial (int n){
		if (n<=1){
		return 1; 
		}
		else { 
		return n*CalcularFactorial(n-1);
		}
	}
    public static long potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1; 
        }
        else {
            return base*potencia(base, exponente - 1);
        }
    }
    public static void main (String[] args){
    int op;
    Scanner leer = new Scanner(System.in);
        System.out.println("Seleccione la operación que desea realizar:");
        System.out.println("1-Potencia              2-Factorial");
        System.out.print("Opción: ");
        op = leer.nextInt(); 
        
        switch (op){
            case 1:
                System.out.println("Ingrese la base y el exponente para realizar la potencia");
                System.out.print("Numero Base:");
                int n = leer.nextInt(); 
                System.out.print("Numero Exponente:");
                int m = leer.nextInt(); 
                System.out.println("El numero " + n + " elevado a " + m + " da como resultado: " + potencia(n, m));   
                break;
            case 2:
                System.out.println("Ingrese el numero del que desea conocer su Factorial");
                System.out.print("Numero: ");
                int x = leer.nextInt(); 
                System.out.println("El Factorial del numero " + x + " es: " + CalcularFactorial(x)); 
                break; 
        }
    }
}
