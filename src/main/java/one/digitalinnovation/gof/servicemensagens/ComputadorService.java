package one.digitalinnovation.gof.servicemensagens;

public class ComputadorService {
    public static void main(String[] args) {
        ServiceMessengerInstantania smi = null;

        String appEscolhido = "fbm";
        if (appEscolhido.equals("msn")) {
            smi = new MsnMessenger();
        } else if (appEscolhido.equals("fbm")) {
            smi = new FacebookMessenger();
        } else if (appEscolhido.equals("tlg")) {
            smi = new TelegramMessenger();
        }
        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
