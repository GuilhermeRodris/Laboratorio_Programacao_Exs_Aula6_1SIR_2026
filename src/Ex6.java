//Escreva um programa em Java que leia um ano
//e determine se ele é bissexto ou não.
//Um ano é bissexto se for divisível por 4, exceto
//os anos divisíveis por 100 — que só são
//bissextos se também forem divisíveis por 400.
//Exemplos: 2000 é bissexto, 1900 não é, 2024 é.

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        int ano;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano: ");
        ano = sc.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("O ano" + ano + "é bissexto" );
        }

        else {
            System.out.println("O ano " + ano + " não é bissexto" );
        }
    }
}
