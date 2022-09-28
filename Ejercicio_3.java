import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su valor númerico:");
        int int_2 = sc.nextInt();
        try {
            if(int_2 > 0) {
                NumeroNegativoExcepcion.raiz (int_2);
            } else {
                NumeroNegativoExcepcion.mostrar();
            }
        } catch (InputMismatchException ex){
        }
    }
}



