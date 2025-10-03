package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_15 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a temperatura da maquina:");
        double temperatura= sc.nextDouble();
        if (temperatura >= 90) {
            System.out.println("Temperatura OK.");
        }
        else {
            System.out.println("Desligar.");
        }
    }
}
