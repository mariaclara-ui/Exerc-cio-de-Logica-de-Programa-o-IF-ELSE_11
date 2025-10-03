package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_18 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a porcentagem de energia solar sobrando:");
        int porcentagem= sc.nextInt();
        if (porcentagem<=30){
            System.out.println("Usar rede eletrica.");
        }
        else if (porcentagem<=70){
            System.out.println("Hibrido.");
        }
        else {
            System.out.println("Usar energia solar.");
        }
    }
}
