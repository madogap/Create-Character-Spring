package one.digitalinnovation.gof.controledefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        try {
             System.out.println("Digite o primeiro numero ");
            int parametroUm = terminal.nextInt();

            System.out.println("Digite o segundo numero");
            int parametroDois = terminal.nextInt();

            if (verificaNumero(parametroUm, parametroDois)) {
                System.out.println("Os numeros estao na ordem correta");
            
            } else {
                System.out.println("O primeiro numero deve ser menor que o segundo");                   

            }
        } catch (Exception e) {
            System.out.println("Leia com atenção. os campos são de números: POR FAVOR DIGITE CORRETAMENTE KKKKKK");
        }
       

    }

    static void contar(int parametroUm, int parametroDois) {
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }

    static boolean verificaNumero(int parametroUm, int parametroDois) {
        return parametroDois > parametroUm;
    }

    // static void contar(int parametroUm, int parametroDois) throws
    // ParametrosInvaldException {
    // int contagem = parametroDois - parametroUm;
    // Realizar o for para imprimir os numeroes com base na variravel contagem
    // }
}
