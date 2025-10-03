package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_24 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a quantidade do produto:");
        int quantidade= sc.nextInt();
        if (quantidade<=10){
            System.out.println("Reabastecer.");
        }
        else if (quantidade<=30){
            System.out.println("ALERTA!");
        }
        else {
            System.out.println("Normal.");
        }
    }
}
