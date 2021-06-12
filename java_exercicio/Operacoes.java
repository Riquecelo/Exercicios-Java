package java_exercicio;

import java.util.Scanner;

public class Operacoes{
    public static void main(String[] args) {
        double num1, num2, soma, sub, mult, div;
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um número:");
        num1 = entrada.nextDouble();
        System.out.println("digite outro numero:");
        num2 = entrada.nextDouble();
       
        soma = num1+num2;
        System.out.println("resultado da soma " + soma);

        sub = num1 - num2;
        System.out.println("resultado da subtraçao " + sub);

        mult = num1 * num2;
        System.out.println("resultado da multiplicaçao " + mult);

        div = num1 / num2;
        System.out.println("resultado da divisao " + div);
    }
}