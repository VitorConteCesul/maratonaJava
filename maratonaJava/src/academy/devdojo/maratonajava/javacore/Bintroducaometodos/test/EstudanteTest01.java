package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Eduardo";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Valdenir";
        estudante02.idade = 48;
        estudante02.sexo = 'M';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.idade);

        impressoraEstudante.imprime(estudante01);

        System.out.println("----------------------------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);

    }
}
