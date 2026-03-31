//Desconto em Compras
//Uma loja de departamentos oferece desconto
//em função do valor total das compras. Se o
//total for maior que R$1.000,00 o cliente recebe
//15% de desconto; caso contrário, recebe
//apenas 8% de desconto.
//Escreva um programa em Java que calcule e
//imprima o valor final que o cliente irá pagar e o
//valor economizado com o desconto.

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vcompra, vdesconto;

        System.out.print("Digite o valor da compra: ");
        vcompra = sc.nextDouble();

        if (vcompra > 1000){
            vdesconto = vcompra * 0.15;
            vcompra = vcompra - vdesconto;

        }

        else{
            vdesconto = vcompra * 0.08;
            vcompra = vcompra - vdesconto;
        }

        System.out.printf("O valor do desconto foi de: %.2f\n", vdesconto );
        System.out.printf("O valor final da compra foi de: %.2f\n", vcompra);
    }
}
