package mooPay;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ProcessadorPagamento <Transacao> processador = new ProcessadorPagamento<>();

        PagamentoPix pix1 = new PagamentoPix(1,244.4,StatusTransacao.APROVADO,"27 9976767697");
        PagamentoPix pix2 = new PagamentoPix(1,532.0,StatusTransacao.APROVADO,"27 9976767697");
        PagamentoCartao cartao1 = new PagamentoCartao(1,100.0,StatusTransacao.RECUSADA,"1234567812345678");


        System.out.println(" -------- SEJA BEM VINDO AO MOO PAY --------");

        System.out.println("ADICIONANDO TRANSAÇOES...");
        processador.adicionarTransacao(pix1);
        processador.adicionarTransacao(pix2);
        processador.adicionarTransacao(cartao1);

        System.out.println("\nPROCESSANDO PAGAMENTOS...");
        processador.processarTodas();


        processador.exibirRelatorios();

        System.out.println("\nTRANSAÇÕES APROVADAS");
        List<Transacao> aprovadas = processador.filtrarStatus(StatusTransacao.APROVADO);
        for (Transacao t : aprovadas) {
            System.out.println("-" + t);
        }

        System.out.println("\nTRANSAÇÕES RECUSADAS");
        List<Transacao> recusadas = processador.filtrarStatus(StatusTransacao.RECUSADA);
        for (Transacao t : recusadas) {
            System.out.println("-" + t);
        }

        System.out.println("\n" + processador);







    }
}
