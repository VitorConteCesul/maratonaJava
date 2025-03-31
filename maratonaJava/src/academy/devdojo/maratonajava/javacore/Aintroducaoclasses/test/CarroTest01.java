package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;


import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "BMW 320i";
        carro1.modelo = "Sport";
        carro1.ano = 2025;

        carro2.nome = "Camaro";
        carro2.modelo = "Turbo";
        carro2.ano = 2025;

        System.out.println("Carro 1: ");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2: ");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
