package ejercicios;
import java.util.Scanner; 

public class Determinante {
    
    public static int[][] conseguircofactor(int[][] m , int n, int i, int j){
        int[][] cofactor = new int[n-1][n-1];
        int fila = 0;
        int columna = 0; 
            for (int a=0; a<n; a++){
                for(int b=0; b<n; b++){
                    if ((a!=i) && (b!=j)){
                        cofactor[fila][columna] = m[a][b]; 
                        columna ++;
                        if (columna == n-1){
                            columna=0;
                            fila++; 
                        }
                    }
                }
            }
            return cofactor; 
    }
    public static int determinante(int [][] m, int n){
            if (n==1){
                    return m[0][0];
            }
            else{
                int det = 0; 
                int mult = 1;
                
                for (int i =0; i<n; i++){
                    det += m[0][i]*determinante(conseguircofactor(m,n,0,i), n-1)*mult; 
                    mult*=-1; 
                }
                return det; 
            }
    }
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); 
        System.out.println("Ingrese la dimensión de la matriz: ");
        int n = leer.nextInt(); 
        int [][] matriz = new int[n][n]; 
        
            for (int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.println("Ingrese el numero en la posición ("+ i + ")" + "(" + j + "): ");
                    matriz[i][j]= leer.nextInt(); 
                }
            }
            System.out.println("La determinante de la matriz ingresada es: " + determinante(matriz, n));
    }
}
