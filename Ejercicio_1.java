import java.sql.SQLOutput;
public class Ejercicio_1 {
    public static void main(String[] args) {
        String cadena = "desarrollo de sistemas 3";
        int bar_1 = 5;
        caracterEn(cadena, bar_1);
    }
    public static void caracterEn(String cadena, int bar_1) {
        try {
            if (bar_1 <= cadena.length() && bar_1 > 0) {
                System.out.println("Número de caracter de cadena: " + cadena.charAt(bar_1));
            }
        } catch (Exception e) {

        }
    }
}
