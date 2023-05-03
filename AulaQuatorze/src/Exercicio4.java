import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio4 {
    public static void main(String[] args)
    {
        int menorValor = numeroAleatorio();
        System.out.println("o menor valor é: "+menorValor);
    } public static int numeroAleatorio() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de valores");
        int numero = sc.nextInt();
        int[] valores = new int[numero];


        System.out.println("Digite os valores");
        for (int i = 0; i < valores.length; i++)
        {valores[i] = sc.nextInt();}

        int menorValor = valores[0];
        for (int i = 1; i< valores.length; i++)
        {
            if (valores[i] < menorValor)
            {menorValor = valores[i];}
            }
        return menorValor ;
        }
}


