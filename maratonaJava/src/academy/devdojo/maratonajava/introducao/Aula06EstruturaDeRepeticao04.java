package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    public static void main(String[]args){
        //Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condições valorParcela >= 1000
        
        double valorCarro = 30000;

        for (int parcela = 1; parcela <= valorCarro ; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }else {
                break;
            }
        }
    }
}
