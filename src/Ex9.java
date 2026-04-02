//Escreva um programa em Java que leia uma
//temperatura em graus Celsius e classifique-a
//segundo os critérios abaixo:
//Abaixo de 20°C → "Frio"
//Acima de 20°C → "Quente"
//Imprima a classificação correspondente.

import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celcius;

        System.out.print("Digite o valor númerico da temperatura em Celsius: ");
        celcius = sc.nextInt();

        if (celcius > 20){
            System.out.print("Hoje está quente");
        } else if (celcius < 20) {
            System.out.print("Hoje está frio");
        }
        else {
            System.out.println("Hoje está ameno");
        }
    }
}
