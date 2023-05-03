import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        double valorDefinido = resultado();
        System.out.println("O valor definido é: "+ resultado());
    }public static double resultado() {
        System.out.print("Digite o seu nome: ");
        String nome;
        Scanner leia = new Scanner(System.in);
        nome = leia.nextLine();

        System.out.print("Digite o seu salário: ");
        double salario;
        salario = leia.nextDouble();

        System.out.print("Digite o valor total das suas vendas no mês: ");
        double vendas;
        vendas = leia.nextDouble();
        {
        double total,comissao;
        total = salario + vendas;
        comissao = total * 0.15;

        return total;
        }
    }
}
