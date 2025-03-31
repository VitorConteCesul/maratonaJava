package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        double salario = scanner.nextDouble();

        String msgdoar = "Eu vou doar";
        String msgnaodoar = "Eu não vou doar";

        System.out.println(salario > 5000 ? msgdoar : msgnaodoar);

    }
}
