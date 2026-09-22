import java.util.Scanner;
public class cores {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String[] cores = new String[11];
        int contAzul = 0;
        int contRosa = 0;

        for(int k = 0; k < 11; k++){
        System.out.println("digite a cor" + ( + 1) +"(azul ou rosa):");
        cores[k] = leitor.next();
            if (cores[k].equals("azul")) {
                contAzul++;
            } else if (cores[k].equals("rosa")){
                contRosa++;
                }
            }
        if(contAzul > contRosa){
            System.out.println("A cor mais escolhida foi: Azul");
        }else if(contRosa > contAzul){
            System.out.println("A cor mais escolhida foi: Rosa");
        }else{
            System.out.println("houve um empate entre azul e rosa!");
        }
        leitor.close();

    }
}
