package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Conte";
        estudante2.idade = 43;
        estudante2.sexo = 'M';

        System.out.println(estudante2.nome);
    }
}
