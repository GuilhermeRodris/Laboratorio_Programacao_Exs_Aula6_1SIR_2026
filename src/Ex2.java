//Média Final do Aluno
//O professor aplicou durante o semestre duas
//provas e três trabalhos. A média final será
//composta por 70% da média das provas e 30%
//da média dos trabalhos.
//Escreva um programa em Java que calcule e
//imprima a média final de um aluno e também a
//sua situação — aprovado ou reprovado —
//considerando que a média mínima para
//aprovação é 6.

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double medp,medt,medf, np1, np2, nt1, nt2, nt3;

        System.out.print("Digite a nota da primeira prova: ");
        np1 = sc.nextDouble();
        System.out.print("Digite a nota da segunda prova: ");
        np2 = sc.nextDouble();

        System.out.print("Digite a nota do primeiro projeto: ");
        nt1 = sc.nextDouble();
        System.out.print("Digite a nota do segundo projeto: ");
        nt2 = sc.nextDouble();
        System.out.print("Digite a nota do terceiro projeto: ");
        nt3 = sc.nextDouble();

        medp = (np1 + np2) / 2;
        medt = (nt1 + nt2 + nt3) / 3;

        System.out.printf("A média das provas foi de: %.2f\n", medp);
        System.out.printf("A média dos trabalhos foi de: %.2f\n", medt);

        medf = (medp * 0.7) + (medt * 0.3);

        System.out.printf("A média final do aluno foi de: %.2f\n", medf);

        if (medf >= 6) {
            System.out.println("O aluno foi aprovado");
        }

        else {
            System.out.println("O aluno foi reprovado");
        }
    }
}
