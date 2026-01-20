package mooPay;

public class PagamentoCartao extends Transacao {

    private String numero;

    public PagamentoCartao(){

    }

    public PagamentoCartao(int id, double valor, StatusTransacao status, String numero){
        super(id,valor,status);
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento Cartão | Valor R$" + getValor() + " | Cartão final " + numero.substring(numero.length()-4));
        this.setStatus(StatusTransacao.APROVADO);
    }
}
