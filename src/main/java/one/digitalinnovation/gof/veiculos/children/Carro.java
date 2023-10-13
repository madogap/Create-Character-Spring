package one.digitalinnovation.gof.veiculos.children;

import one.digitalinnovation.gof.veiculos.parents.Veiculo;

public class Carro extends Veiculo{
  
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }


    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }
    private void confereCombustivel() {
        System.out.println("Conferindo combustivel");
    }


    public void setChassi(String string) {
    }
}