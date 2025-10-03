package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_25 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a intensidade eletrica.");
        int intensidade= sc.nextInt();
        if (intensidade<=100){
            System.out.println("Intensidade fraca.");
        }
        else if (intensidade<=200){
            System.out.println("Intensidade média.");
        }
        else {
            System.out.println("Intensidade forte.");
        }
    }
}
