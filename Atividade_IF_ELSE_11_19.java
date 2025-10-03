package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_19 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o ph da água: ");
        int ph = sc.nextInt();
        if (ph <= 7) {
            System.out.println("Basico");
        }
        else if(ph==7){
            System.out.println("Neutro");
        }
        else {
            System.out.println("Acido");
        }
    }
}
