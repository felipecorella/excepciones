import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio_2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Escriba la cadena");
            String cadena = sc.nextLine();
            int bar_1 = 7;
            caracterEn(cadena, bar_1);
        }
        public static void caracterEn(String cadena,int bar_1){
            try {
                if (bar_1 <= cadena.length() && bar_1 > 0) {
                    System.out.println("Num. Caracter de cadena: " + cadena.charAt(bar_1));
                }else{
                    System.out.println("Posicion de cadena no existente");
                }
            } catch (InputMismatchException ex) {

            }

        }
    }
