public class Main {

    public static void main(String[] args) {
        System.out.println("Hello calculator");

        Calculator calc1 = new Calculator();

        System.out.println("La suma de 25 + 15 es =  " + calc1.sumar(25,15));
        System.out.println("La suma de 25 - 15 es =  " + calc1.restar(25,15));
    }

}
