import functions.*;

public class main {

    public static void main(String[] args) {
        Chanchito chanchito = new Chanchito();
        chanchito.callChanchito();
        Suma suma = new Suma();
        System.out.println("La suma de 2 y 3 es: " + suma.sumar(3,2));
    }
}
