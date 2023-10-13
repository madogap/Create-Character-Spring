package one.digitalinnovation.gof.servicemensagens;

public class MsnMensagem {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Msn");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Msn");
  salvarHistoricoMensagem();
    }

}
