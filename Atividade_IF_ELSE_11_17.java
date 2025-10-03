package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_17 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("O robô A está funcionado?");
        String roboA= sc.nextLine();
        System.out.println("O robô B está funcionado?");
        String roboB= sc.nextLine();
        if (roboA.equals("não")&&roboB.equals("não")){
            System.out.println("Parar a linha.");
        }
        else if(roboA.equals("sim")&&roboB.equals("não"))
        {
            System.out.println("Acionar robô B.");
        }
        else {
            System.out.println("Continuar produção.");
        }
    }
}
