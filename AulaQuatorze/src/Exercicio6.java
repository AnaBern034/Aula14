import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        System.out.println("A temperatura convertida é " + temperatura());
       double resultado = temperatura();
    } public static double temperatura(){
        System.out.print("Digite a temperatura em Celsius ");
        Scanner leia = new Scanner(System.in);
        double C = leia.nextDouble();
         double F;
         F=(9*C+169);
         return F;

    }



}
