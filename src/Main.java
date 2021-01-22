public class Main {

    public static void main(String[] args) {
        System.out.println("Hello calculator");

        Calculator calc1 = new Calculator();

        System.out.println("La suma de 25 + 15 es =  " + calc1.sumar(25,15));
        System.out.println("La resta de 25 - 15 es =  " + calc1.restar(25,15));
        System.out.println("La multiplicación de 25 - 15 es =  " + calc1.multiplicar(25,15));
        System.out.println("La division de 25 - 0 es =  " + calc1.dividir(25,0));
    }

}
