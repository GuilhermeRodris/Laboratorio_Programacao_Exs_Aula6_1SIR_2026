//Escreva um programa em Java que leia um ano
//e determine se ele é bissexto ou não.
//Um ano é bissexto se for divisível por 4, exceto
//os anos divisíveis por 100 — que só são
//bissextos se também forem divisíveis por 400.
//Exemplos: 2000 é bissexto, 1900 não é, 2024 é.

import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        double ano, bissexto;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        ano = sc.nextDouble();

        bissexto = ano % 4;

        if (bissexto == 0){
            bissexto = ano % 100;
            if (bissexto == 0){
                bissexto = ano % 400;
                if (bissexto == 0){
                    System.out.printf("O ano %.0f é bissexto", ano );
                }
                else {
                    System.out.printf("O ano %.0f não é bissexto", ano );
                }
            }
            else {
                System.out.printf("O ano %.0f ´é bissexto", ano );
            }

        }

        else {
            System.out.printf("O ano %.0f não é bissexto", ano);
        }
    }
}
