//Expressão Matemática
//Desenvolva um programa em Java que calcule
//e imprima o valor da expressão:
//Atenção: para o cálculo da expressão, a variável
//x pode receber qualquer valor? Lembre-se: não
//existe divisão por zero nem raiz quadrada de
//número negativo no campo dos números reais.

import java.util.Scanner;
import static java.lang.Math.pow;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.print("Digite o valor da variável X: ");
        x = sc.nextDouble();
        if (x <= 5 && x >=-5) {
            System.out.printf("O valor %.2f é invalido como valor para X", x);
        }
        else {
            y = 8 / pow((pow(x,2) - 25), (1.0/2.0));

            System.out.printf("O resutado da equação foi: %.2f", y );
        }
    }
}
