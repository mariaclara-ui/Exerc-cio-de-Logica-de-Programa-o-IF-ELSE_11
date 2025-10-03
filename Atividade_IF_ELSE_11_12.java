package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Crachá valido? ");
        System.out.println("Seu crachá e valido?");
        String cracha = sc.nextLine();
        System.out.println("Está com o capacete de segurança?");
        String seguranca = sc.nextLine();
        System.out.println("O horario do turno está correto?");
        String horario = sc.nextLine();
        if (cracha.equals("sim") && seguranca.equals("sim") && horario.equals("sim")) {
            System.out.println("Acesso aprovado.");
        } else{
            System.out.println("Acesso negado.");
        }
    }
}

