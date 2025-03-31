package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int [][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{645,564,5,454,544,4,45,4,3,3};
        arrayInt[1] = new int[]{1, 54, 65};
        arrayInt[2] = new int[4];

        for (int[] arrayBase : arrayInt){
            System.out.println("\n--------");
            for (int num : arrayBase){
                System.out.print(num + " ");
            }
        }
    }
}
