package one.digitalinnovation.gof.veiculos;

import one.digitalinnovation.gof.veiculos.children.Carro;
import one.digitalinnovation.gof.veiculos.children.Moto;
import one.digitalinnovation.gof.veiculos.parents.Veiculo;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("21313123213asfdasdf");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("kisa20saaksp-1s");
        z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}