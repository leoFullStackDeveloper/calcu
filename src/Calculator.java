public class Calculator {


    public int sumar(int num1, int num2){
        return num1 + num2;
    }

    public int restar(int num1, int num2){
        return num1 - num2;
    }
    public int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public double  dividir(double num1, double num2){
        if (num2 == 0){
            return 0;
        }else{
            return num1 / num2;
        }

    }

}