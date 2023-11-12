package ejercicios;
public class PalindromoR {
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
    public static void main (String[] args){
        PalindromoR("12321"); 
    }
}
