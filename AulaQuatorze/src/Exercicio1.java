import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        int numeroDigitado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor");
        numeroDigitado = sc.nextInt();
        int resultado = valor(numeroDigitado);
        System.out.println("O valor da soma é: "+resultado);

    }
    public static int valor (int numeroDigitado){
        int resultado = 0;
        for (int i =1; i<= numeroDigitado ; i++)
        {
            resultado += i;
        }
        return resultado;


    }

    }
