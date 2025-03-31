package academy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        byte dia = 1;

        switch (dia) {
            case 1:
                System.out.println("Não é dia útil");
                break;
            case 2:
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("dia útil");
                break;
            case 4:
                System.out.println("dia útill");
                break;
            case 5:
                System.out.println("dia útil");
                break;
            case 6:
                System.out.println("dia útil");
                break;
            case 7:
                System.out.println("Não é dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
