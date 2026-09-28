import java.util.Scanner;
public class leitorDeNumerosInteiros {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("Digite 5 números inteiros");
        for(int k=0; k <5; k++) {
            numeros[k] = leitor.nextInt();
        }
        int menor = numeros[0];
        for(int k = 1; k < 5; k++) {
            if (numeros[k] < menor) {
                menor = numeros[k];
            }
        }
        System.out.println("O menor número é:" + menor);
        leitor.close();
    }

}