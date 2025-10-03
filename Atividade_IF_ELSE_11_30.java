package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_30 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a temperatura:");
        int intensidade= sc.nextInt();
        if (intensidade<=60){
            System.out.println("Normal.");
        }
        else if (intensidade<=80){
            System.out.println("Resfriamento extra.");
        }
        else {
            System.out.println("Desligar servidores.");
        }
    }
}