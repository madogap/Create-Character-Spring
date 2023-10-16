package one.digitalinnovation.gof.controlescandidatos.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        // analisarCandidato(1000.99);
        // analisarCandidato(2000);
        // analisarCandidato(5000.99);
        //selecaoCandidato();
        //`````imprimirSelecionados();
        String[]candidatos = { "Toni", "Paulo", "Marcus", "Joao", "Tobi",};
         for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }

    }

    
    static void entrandoEmContato(String candidato){
        int tetantivasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tetantivasRealizadas++;

            } else {
                System.out.println("Contato Realizado com sucesso");
            }
        } while (continuarTentando && tetantivasRealizadas < 3);
            if (atendeu) {
                System.out.println("Conseguimos contato "+ candidato + " NA " + tetantivasRealizadas+ " TENTATIVA");
            } else {
                System.out.println("Nao conseguiu contato com o candidato" + candidato + ", NUMERO MAXIMO DE TENTATIVAS " + tetantivasRealizadas);
            }
    }
    
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = { "Toni", "Paulo", "Marcus", "Joao", "Tobi", "Luan", "Kai", "Nal", };
        System.out.println("Imprimindo a lista de candidatos mostrando o indice deles ");

        for (int i = 0; i<candidatos.length; i++) {
            System.out.println("O candidato de numero "+ (i+1) + " é " +candidatos[i]);
        }
        System.out.println("\nForma abreviada de escrever o for\n ");

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidato() {
        String[] candidatos = { "Toni", "Paulo", "Marcus", "Joao", "Tobi", "Luan", "Kai", "Nal", };

        int candidatosSelecionados = 0;

        int candidatosAtual = 0;

        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];

            double salarioPretendido = valorPretendido();
            System.out.println(candidato + "\n" + salarioPretendido + "\n");
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato foi seleciona para a vaga\n " + candidato + "\n");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1900, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando os resultados dos demais candidatos");

        }

    }
}

