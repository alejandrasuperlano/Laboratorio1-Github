import functions.*;

public class main {

    public static void main(String[] args) {
        Chanchito chanchito = new Chanchito();
        Features callie = new Features();
        chanchito.callChanchito();

        System.out.println("\n El resultado de multiplicar 2 * 3 es: ");
        System.out.println(callie.multi(2,3));

        Suma suma = new Suma();
        System.out.println("La suma de 2 y 3 es: " + suma.sumar(3,2));
    }
}
