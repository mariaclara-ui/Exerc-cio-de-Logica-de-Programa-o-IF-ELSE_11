package ExercíciosdeLogicadeProgramacaoIFELSENivelDifícil;
import java.util.Scanner;
public class Atividade_IF_ELSE_11_20 {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite quantas horas são:");
        int horas= sc.nextInt();
        if (horas<=12){
            System.out.println("Está de manhã.");
        }
        else if (horas<=18){
            System.out.println("Está de tarde.");
        }
        else {
            System.out.println("Está de noite.");
        }
    }
}

