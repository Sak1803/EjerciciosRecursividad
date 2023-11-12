package ejercicios;
import java.util.Scanner; 
//Crea un programa donde se pida en el principal la tabla de multiplicar deseada, en un
//método recursivo generar la tabla de multiplicar. Se multiplicará hasta querer llegar al
//número 12 como resultado.

public class TabladeMultiplicar {
    public static void TablaM(int a, int result,int i){
        if (a==0){
            System.out.println("Elige un numero diferente de 0");
        }
        else if (a>12){
            System.out.println("El numero es mayor que 12, no se imprime nada"); 
        }
        else if (result<=12){
            System.out.println(a + "x" + i + "=" + a*i);
            TablaM(a ,a*(i+1), i+1);  
            }
    }
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese la tabla de multiplicar que desea ver (solo se mostraran los digitos hasta el 12)");
        int N = leer.nextInt(); 
        TablaM(N,1,1);
    }
}
