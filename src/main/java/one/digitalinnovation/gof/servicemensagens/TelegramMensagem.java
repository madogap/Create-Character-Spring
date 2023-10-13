package one.digitalinnovation.gof.servicemensagens;

public class TelegramMensagem  extends ServiceMensagensInstantania {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
        salvarHistoricoMensagem();
    }
}
