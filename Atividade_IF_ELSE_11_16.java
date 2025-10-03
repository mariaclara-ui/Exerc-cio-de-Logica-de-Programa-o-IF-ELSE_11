package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_16 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite qual e o grau de visibilidade dos defeitos.");
        String defeiros= sc.nextLine();
        if (defeiros.equals("visivel")){
            System.out.println("Nivel alto.");
        }
       else if (defeiros.equals("microscopio")){
            System.out.println("Nivel médio.");
       }
        else if (defeiros.equals("ausente")){
            System.out.println("Nivel baixo.");
        }
    }
}
