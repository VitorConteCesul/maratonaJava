package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] idades = {23, 54, 34, 64};
        int[] idades2 = new int[4];

        for (int i : idades){
            System.out.println(i);
        }

        String[] nomes = {"Vitor", "Gabriel", "Conte"};
        for (String n : nomes) {
            System.out.println(n);
        }
    }
}
