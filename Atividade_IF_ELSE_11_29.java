package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_29 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a porcentagem de defeitos:");
        int porcentagem= sc.nextInt();
        if (porcentagem<=10){
            System.out.println("Aprovar.");
        }
        else if (porcentagem<=20){
            System.out.println("Retrabalhar ");
        }
        else {
            System.out.println("Reprovar.");
        }
    }
}
