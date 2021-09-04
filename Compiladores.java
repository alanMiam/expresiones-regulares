import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author MIAM
 */

public class Compiladores {
    
     public static boolean busca_3a(String cadena){
        String  expR = ".[aA].[aA].[aA]";
        Pattern pat = Pattern.compile(expR);
        Matcher mat = pat.matcher(cadena);                                                                                   
        return mat.matches();
    }
    //--------------------------- P R I M E R O --------------------------------
     String owofied(String cadena){
         String resultado = cadena;
            
         resultado=resultado.replace("i","wi");
         resultado=resultado.replace("e","we");
         resultado = resultado+"owo";
         return resultado;
     }
    //--------------------------- S E G U N D O --------------------------------
     String countVowels(String cadena){
         String resultado = cadena;
         int contador=0;
         
         char[] cad = resultado.toCharArray();
         for (int i = 0; i < resultado.length(); i++) {
            if (cad[i]=='a' ||cad[i]=='e' || cad[i]=='i' || cad[i]=='o' || cad[i]=='u') {
                contador=contador+1;
            }    
        }
         return resultado+": tiene "+contador+" vocales.";
     }
     
    //--------------------------- T E R C E R O -------------------------------- 
     String doubleLetters(String cadena){
        String resultado=cadena+"";
        boolean resp =false;
         
        char[] cad = resultado.toCharArray();
        for (int i = 0; i < resultado.length()-1; i++) {
             if (cad[i]==cad[i+1] && Character.isLetter(cad[i])) {
                resp=true;
            }
        }  
        return "Tiene dos letras iguales consecutivas: "+resp;
    }
     
    //---------------------------- C U A R T O ---------------------------------
    String removeVowels(String cadena){

    String resultado = cadena;
    resultado=resultado.replace("a","");
    resultado=resultado.replace("e","");
    resultado=resultado.replace("i","");
    resultado=resultado.replace("o","");
    resultado=resultado.replace("u","");
    
    resultado=resultado.replace("A","");
    resultado=resultado.replace("E","");
    resultado=resultado.replace("I","");
    resultado=resultado.replace("O","");
    resultado=resultado.replace("U","");
        return resultado;
    }
    
    public static void main(String[] args) {
        String cadena;
        System.out.println("Introduzca una cadena de caracteres: ");
        Scanner entrada = new Scanner(System.in);
        cadena= entrada.nextLine();
        System.out.println("Seleccione una opción: ");
        System.out.println("1) owofied      2)countVowels       3)doubleLetters     4)removeVowels      <1 o >4)salir");
        int eleccion = entrada.nextInt();
        
        Compiladores c = new Compiladores();
        
        switch(eleccion){
        case 1:
            System.out.println(c.owofied(cadena));
        break;
        case 2:
            System.out.println(c.countVowels(cadena));
        break;
        case 3:
            System.out.println(c.doubleLetters(cadena));
        break;
        case 4:
            System.out.println(c.removeVowels(cadena));
        break;
        default:
            System.out.println("Bye");
        break;
        }    
    } 
}
