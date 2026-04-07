//Escreva um programa em Java que leia três
//valores e verifique se os mesmos representam
//os lados de um triângulo.
//Para que os valores representem os lados de
//um triângulo é necessário que cada um dos
//lados seja menor que a soma dos outros dois:

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l1, l2, l3, verifica1, verifica2, verifica3;
        System.out.print("Digite o valor do primeiro lado do triângulo: ");
        l1 = sc.nextDouble();
        System.out.print("Digite o valor do segundo lado do triângulo: ");
        l2  = sc.nextDouble();
        System.out.print("Digite o valor do terceiro lado do triângulo: ");
        l3 = sc.nextDouble();

        verifica1 = l1 + l2;
        verifica2 = l1 + l3;
        verifica3 = l2 + l3;

        if (verifica1 > l3 && verifica2 > l2 && verifica3 > l1){
            System.out.print("Os lados informados produzem um triângulo");
        }

        else {
            System.out.println("Os lados informados não podem pertencer a um triângulo");
        }

    }
}
