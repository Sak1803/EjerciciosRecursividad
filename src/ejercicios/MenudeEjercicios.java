package ejercicios;
import static ejercicios.Determinante.determinante;
import java.util.Scanner; 
public class MenudeEjercicios {
    
        //Ejercicio de Ciudades
        public static void CiudadesR(int i){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la Ciudad " + i + ":"); 
		String ciudad = leer.nextLine();
		if (i<10){
			CiudadesR(i+1);
		}
			System.out.println(ciudad);
	}
         //Fin De Ejercicio de Ciudades
        
        //Fibonacci
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
         //Fin de Fibonacci
            
         //Invertir Palabra
        public static void AlrevesR(String p){
                if (!p.isEmpty()){
                    char m = p.charAt(p.length()-1);
                    System.out.print(m);
                    p = p.substring(0,p.length()-1); 
                    AlrevesR(p);
                }
        }
        //Fin Invertir Palabra
         
        //Hezadecimal
        public static void HexadecimalR (int h, int B){
                int resto = h%B; 
                if (h>B){
                    HexadecimalR(h/B,B); 
                }
                if (resto >= 0 & resto <10){
                    System.out.print(resto);
                }
                else { 
                    switch(resto){ 
                        case 10:
                            System.out.print("A");     
                            break; 
                        case 11:
                            System.out.print("B");   
                            break; 
                        case 12:
                            System.out.print("C");   
                            break; 
                        case 13:
                            System.out.print("D");   
                            break; 
                        case 14:
                            System.out.print("E");   
                            break; 
                        case 15:
                            System.out.print("F");   
                            break;
                    }
                }
        }
        //Fin Hexadecimal
        
        //Palindromo
        public static void PalindromoR(String p){
            if (p.length()<=1){
                System.out.println("Es Palindromo");
            }
            else if (p.charAt(0)==p.charAt(p.length()-1)){
                PalindromoR(p.substring(1,p.length()-1)); 
            }
            else{
                System.out.println("No es Palindromo");
            }
        }
        //Fin Palindromo
        
        //Determinante
        
        public static int[][] calcularCofactor(int[][] matriz, int dimension, int filaExcluir, int columnaExcluir) {
                int[][] cofactor = new int[dimension - 1][dimension - 1];
                int nuevaFila = 0;
                int nuevaColumna = 0;

                for (int fila = 0; fila < dimension; fila++) {
                    for (int columna = 0; columna < dimension; columna++) {
                        if ((fila != filaExcluir) && (columna != columnaExcluir)) {
                            cofactor[nuevaFila][nuevaColumna] = matriz[fila][columna];
                            nuevaColumna++;
                            if (nuevaColumna == dimension - 1) {
                                nuevaColumna = 0;
                                nuevaFila++;
                            }
                        }
                    }
                }

            return cofactor;
        }
        public static int calcularDeterminante(int[][] matriz, int dimension) {
            if (dimension == 1) {
                return matriz[0][0];
            } else {
                int determinante = 0;
                int multiplicador = 1;

                for (int i = 0; i < dimension; i++) {
                    determinante += matriz[0][i] * calcularDeterminante(calcularCofactor(matriz, dimension, 0, i), dimension - 1) * multiplicador;
                    multiplicador *= -1;
                }
                return determinante;
            }
        }

        
        //Fin del determinante
        
        //SumaRecursiva
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
        //Fin SumaRecursiva
        
        //Tabla de Multiplicar
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
        //Fin Tabla de multiplicar
        
        //Factorial y Potenciación
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
        //Fin Factorial y Potenciación
            
        //Suma de Pares e Impares
        
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
        //Fin de Suma Pares e Impares
         
        public static void MostrarEjercicios(){
            System.out.println("Bienvenido a los ejercicios de recursividad, seleccione la opción que desee: ");
            System.out.println("1. Fibonacci");
            System.out.println("2. Ciudades");
            System.out.println("3. Invertir Palabra");
            System.out.println("4. Hexadecimal");
            System.out.println("5. Palíndromo");
            System.out.println("6. Suma");
            System.out.println("7. Tabla de Multiplicar");
            System.out.println("8. Factorial y Potenciación");
            System.out.println("9. Suma de Pares e Impares");
            System.out.println("10. Matriz Identidad");
            System.out.println("11. Salir");
            System.out.print("Opción: ");
            ejercicios(); 
        }
        public static boolean Continuar() {
            Scanner leer = new Scanner(System.in);
            System.out.println("Desea continuar probando ejercicios?");
            System.out.println("1. Si    2. No");
            System.out.print("Opción: ");
            String respuesta = leer.next().toLowerCase(); 
            if (respuesta.equals("1") || respuesta.equals("s")) {
                return true;
            }
            else if (respuesta.equals("2") || respuesta.equals("n")) {
                return false;
            }
            else {
                System.out.println("Por favor, ingrese '1' o 's' para continuar, '2' o 'n' para salir.");
                return Continuar(); 
            }
        }
        public static void ejercicios(){
                Scanner leer = new Scanner(System.in); 
                int op = leer.nextInt();

                switch (op){
                    case 1:System.out.print("Ingresa la posición de la secuencia Fibonacci que deseas conocer: ");
                        int F = leer.nextInt();
                        Resolver(0, F, 0, 0);
                        break;
                    case 2: CiudadesR(1); 
                        break;
                    case 3:System.out.print("Ingresa la palabra que desea invertir: ");
                        leer.nextLine();
                        String A = leer.nextLine();  
                        AlrevesR(A);
                        break;
                    case 4:System.out.print("Ingresa el numero que desea convertir ");
                        int H = leer.nextInt();
                        HexadecimalR(H, 16); 
                        break;
                    case 5:System.out.print("Ingresa el numero o palabra para verificar si es Palindromo: ");
                        leer.nextLine();
                        String p = leer.nextLine();  
                        PalindromoR(p); 
                        break;
                    case 6:System.out.print("Ingresa el numero que deseas sumar: ");
                        int S = leer.nextInt();
                        System.out.print("Ingresa la cantidad de veces a sumar: ");
                        int s = leer.nextInt();    
                        System.out.println("\nLa suma del numero " + S + " sumado " + s + " veces es: " + SumaR(S,s));   
                        break;
                    case 7:System.out.println("Ingresa el numero del que desea la tabla de multiplicar (solo se mostraran hasta que el resultado sea igual o menor a 12) ");
                           System.out.print("Numero:  ");
                            int T = leer.nextInt();   
                            TablaM(T, 1, 1); 
                        break;
                    case 8:
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
                        break;
                    case 9:System.out.print("Ingresa la cantidad de numeros que desea sumar: ");
                        int C = leer.nextInt();
                        SumayMuestraR(0, 0, 0, 0, C);
                        break;
                    case 10:System.out.println("Ingrese la dimensión de la matriz: ");
                            int n = leer.nextInt(); 
                            int [][] matriz = new int[n][n]; 
        
                                for (int i=0; i<n; i++){
                                    for(int j=0; j<n; j++){
                                        System.out.println("Ingrese el numero en la posición ("+ i + ")" + "(" + j + "): ");
                                        matriz[i][j]= leer.nextInt(); 
                                    }
                                }
                                System.out.println("La determinante de la matriz ingresada es: " + determinante(matriz, n));
                        break;
                    case 11:
                        System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                        System.exit(0); 
                        break;
                }
                System.out.println("\nPresiona cualquier tecla para continuar"); 
                leer.nextLine(); 
                leer.nextLine(); 
                    if (Continuar()){
                            MostrarEjercicios();
                            }
                            else{
                                System.out.println("Gracias por usar el programa. ¡Hasta luego!");
                            }
            }
    public static void main(String[] args){
        MostrarEjercicios();
    }
}