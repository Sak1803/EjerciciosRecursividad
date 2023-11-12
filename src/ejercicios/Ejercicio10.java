package ejercicios;
import java.util.Scanner; 
/*
Escriba una función recursiva que sume una N cantidad de números ingresados por el
usuario, debe sumar por separado los positivos y negativos, luego de realizar la suma debe
mostrar cuantos de ellos eran pares e impares.
*/
public class Ejercicio10 {  
    public static void SumayMuestraR(int pares, int impares, int sumaP, int sumaN, int contador){
        Scanner leer = new Scanner(System.in);
        if (contador < 0){
            System.out.println("Ingrese un numero positivo");
        }
        else if (contador == 0){
            System.out.println("Pares: " + pares);
            System.out.println("Impares: " +impares);
            System.out.println("Positvos: " +sumaP);
            System.out.println("Negativos: " +sumaN);
        }
        else {
            System.out.print("Ingrese el numero :");
            int num = leer.nextInt(); 
                if (num == 0){
                    SumayMuestraR(pares + 1, impares, sumaP, sumaN, contador - 1);
                }
                else if (num>0){
                    if (num%2 == 0){
                         pares ++;
                         sumaP= sumaP + num; 
                    }
                    else{
                        impares ++;
                        sumaP= sumaP + num; 
                    }
                }
                else if (num%2 == 0){
                    pares ++;
                    sumaN= sumaN + num; 
                }
                else{
                    impares ++; 
                    sumaN= sumaN + num; 
                }
                SumayMuestraR(pares, impares, sumaP, sumaN, contador-1);
        }
    }
    public static void main(String[] args){
        SumayMuestraR(0,0,0,0,5); 
    }
}
