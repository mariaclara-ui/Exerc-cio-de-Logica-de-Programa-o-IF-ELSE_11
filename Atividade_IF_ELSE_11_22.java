package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_22 {
    static void main() {
        Scanner cs=new Scanner(System.in);
        System.out.println("Digite a quantidade de particulas no ar:");
        int particulas= cs.nextInt();
        if (particulas<=50){
            System.out.println("Bom.");
        }
        else if (particulas<=100){
            System.out.println("Ruim.");
        }
        else {
            System.out.println("Critico.");
        }

    }
}
