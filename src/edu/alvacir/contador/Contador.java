package edu.alvacir.contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = sc.nextInt();

        try {
            verificarNumeros(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro. ");
        }
        
    }

    public static void verificarNumeros(int a, int b) throws ParametrosInvalidosException {
        
        if(a > b){
            throw new ParametrosInvalidosException();
        }

        int contagem = b - a;

        for(int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o numero ".concat(Integer.toString(i+1)));
        }
    }
}
