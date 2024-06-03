public class AparelhoTelefonico extends IPhone {

    public void ligar(String numero) {
        System.out.println("Ligando para numero " + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligacao...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
