package ejercicios;

import java.util.Scanner; 

public class AlReves{
    public static void AlrevesR(String p){
        if (!p.isEmpty()){
            char m = p.charAt(p.length()-1);
            System.out.print(m);
            p = p.substring(0,p.length()-1); 
            AlrevesR(p);
        }
    }
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);  
        System.out.print("Ingresa la palabra que desea invertir: ");
        String P = leer.nextLine();  
        AlrevesR(P);
    }
}
