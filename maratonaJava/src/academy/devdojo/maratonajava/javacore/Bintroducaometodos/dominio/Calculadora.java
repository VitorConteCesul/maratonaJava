package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 120);
    }

    public static void subtraiDoisNumeros() {
        System.out.println(12 - 2);
    }

    public void multiplicarDoisNumeros(int a, int b) {
        System.out.println(a * b);
    }

    public double divideDoisNumeros(double num1, double num2){
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 66;
        num2 = 22;
        System.out.println("Dentro do alteraDoisValores");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }
}


