package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_27 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite qual e o tipo de erro que ouve na produção:");
        String erro= sc.nextLine();
        if (erro.equals("critico")){
            System.out.println("Parar linha.");
        }
        else if (erro.equals("moderado")){
            System.out.println("Acionar manutenção.");
        }
        else {
            System.out.println("Continuar produção.");
        }
    }
}
