package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_21 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a carga");
        int carga= sc.nextInt();
        if (carga<=500){
            System.out.println("Permirtido.");
        }
        else if (carga<=1000){
            System.out.println("Alerta.");
        }
        else {
            System.out.println("Proibido.");
        }
    }
}
