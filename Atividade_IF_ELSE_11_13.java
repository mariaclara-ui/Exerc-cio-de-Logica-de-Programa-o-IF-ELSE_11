package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_13 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a quantidade de peças produzida por hora:");
        int valor= sc.nextInt();
        if (valor<=50){
            System.out.println("Desempenho baixo.");
        }
        else if (valor<=100){
            System.out.println("Desempenho regular.");
        }
        else {
            System.out.println("Desempenho ótimo.");
        }
    }
}
