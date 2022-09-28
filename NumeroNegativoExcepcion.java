public class NumeroNegativoExcepcion {
    int int_2;
    public static void mostrar(){
        System.out.println("ERROR: Número negativo");
    }
    public static void raiz (int int_2) {
        if (int_2 > 0) {
            System.out.println("La raíz del número ingresado es igual a: " + Math.sqrt(int_2));
        }
    }
}
