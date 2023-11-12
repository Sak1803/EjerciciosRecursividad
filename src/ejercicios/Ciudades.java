package ejercicios; 
import java.util.Scanner;
public class Ciudades{
	public static void CiudadesR(int i){
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la Ciudad " + i + ":"); 
		String ciudad = leer.nextLine();
		if (i<10){
			CiudadesR(i+1);
		}
			System.out.println(ciudad);
	}
	public static void main(String[] args){
	CiudadesR(1);
	}
}


