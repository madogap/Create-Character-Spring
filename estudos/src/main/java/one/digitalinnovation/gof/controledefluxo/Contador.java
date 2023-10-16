package one.digitalinnovation.gof.controledefluxo;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número ");
            double primeiroParametro=terminal.nextDouble();
            System.out.println("Digite o primeiro número ");
            double segundoParametro=terminal.nextDouble();

            if (verificaNumero(primeiroParametro, segundoParametro)) {
                System.out.println("Ordem correta os números estão");
            } else {
                System.out.println("O primeiro numero deve ser menor que o segundo"); 
            }
        } catch (Exception e) {
            System.out.println("Leia com atenção. os campos são de números: POR FAVOR DIGITE CORRETAMENTE KKKKKK");
        }
    }

    private static boolean verificaNumero(double primeiroParametro, double segundoParametro) {

        return primeiroParametro < segundoParametro;
    }
    
}
