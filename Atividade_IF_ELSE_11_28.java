package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_28 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite sobre a estrada:");
        String estrada= sc.nextLine();
        if (estrada.equals("bloqueada")){
            System.out.println("Recalcular rota.");
        }
        else if (estrada.equals("Transito")){
            System.out.println("Rota alternativa.");
        }
        else {
            System.out.println("Seguir normalmente.");
        }
    }
}
