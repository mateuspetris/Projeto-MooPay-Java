package Projetos;

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
        System.out.println("Pagamento de R$" + getValor() + " no Cartão final " + numero.substring(numero.length()-4));
        this.setStatus(StatusTransacao.APROVADO);
    }
}
