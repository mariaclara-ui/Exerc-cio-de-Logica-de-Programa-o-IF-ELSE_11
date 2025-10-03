package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_26 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a porcentagem de tinta:");
        int porcentagem= sc.nextInt();
        if (porcentagem<=15){
            System.out.println("Parar.");
        }
        else if (porcentagem<=50){
            System.out.println("ALERTA!");
        }
        else {
            System.out.println("Continuar.");
        }
    }
}
