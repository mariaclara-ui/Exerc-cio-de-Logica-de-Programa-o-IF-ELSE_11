package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_23 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a porcentagem do trafego suspeito:");
        int porcentagem= sc.nextInt();
        if (porcentagem<=30){
            System.out.println("Normal.");
        }
        else if (porcentagem<=70){
            System.out.println("ALERTA!");
        }
        else {
            System.out.println("Bloquear acesso.");
        }
    }
}
