package ejercicios;
/*
Construya una función que convierta un número decimal en una cadena que represente el
valor del número en hexadecimal (base 16). A continuación, generalice la función para
convertir un número decimal en un número en base B (con B <10) 
*/
public class HexadecimalR {
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
    public static void main(String[] args){
        HexadecimalR(65029,16); 
    }
}
