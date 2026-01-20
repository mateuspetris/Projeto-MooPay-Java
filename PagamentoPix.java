package mooPay;

public class PagamentoPix extends Transacao {

    // Atributos

    private String chave;

    public PagamentoPix(){

    }

    public PagamentoPix(int id, double valor, StatusTransacao status, String chave) {
        super(id, valor, status);
        this.chave = chave;
    }


    public String getChave() {
        return chave;
    }


    @Override
    public void processarPagamento(){
        System.out.println("Pagamento PIX | Valor R$" + getValor() + " | Chave: " + chave);
        this.setStatus(StatusTransacao.APROVADO);
    }


}
