import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println("O valor convertido para REAL é: "+ Conversão());
        double resultado = Conversão();

    } public static double Conversão (){
        System.out.print("Digite o valor da cotação (US): ");
        Scanner leia = new Scanner(System.in);
        double cotação = leia.nextDouble();

        System.out.print("Digite quantos dollar você possui: ");
        double US = leia.nextDouble();

        double R$;
        R$ = US/cotação;

        return R$;
    }
}
