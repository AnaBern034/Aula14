import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Digite sua altura: ");
        Scanner sc = new Scanner(System.in);
        double altura = sc.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();


        double valorDigitado = peso /(altura+altura);
        String resultado =  calculo(valorDigitado,altura,peso);
        System.out.println(resultado);
    } public static String calculo(double valorDigitado,double altura,double peso)
    {
        if (valorDigitado < 18.5)
        { return "Você está magro"; }

        else if (valorDigitado <24.9 )
        { return "Você está normal";}

        else if (valorDigitado < 29.9)
        {return "Você está sobrepeso grau 1";}

         else if (valorDigitado < 39.9)
        { return "Você está com obesidade grau 2";}

        else if (valorDigitado > 40.0)
        { return "Você está com obsidade grau 3-- Grave";}

        return null;
    }
}

