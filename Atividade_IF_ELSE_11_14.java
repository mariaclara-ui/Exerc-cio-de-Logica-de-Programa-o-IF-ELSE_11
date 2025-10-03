package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_14 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a velocidade da esteira:");
        int velocidade= sc.nextInt();
        if (velocidade<=6){
            System.out.println("Esteira lenta.");
        }
        else if (velocidade<=10){
            System.out.println("Esteira média.");
        }
        else {
            System.out.println("Esteira rápida.");
        }
    }
}
