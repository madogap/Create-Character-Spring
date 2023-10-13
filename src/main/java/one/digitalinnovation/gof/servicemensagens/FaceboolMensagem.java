package one.digitalinnovation.gof.servicemensagens;

public class FaceboolMensagem {
     public void enviarMensagem() {
            validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook");
        salvarHistoricoMensagem();
    }
}
