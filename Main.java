package Projetos;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Processador genério
        ProcessadorPagamentos<Transacao> processador = new ProcessadorPagamentos<>();

        PagamentoPix pix1 = new PagamentoPix(1,120.0,StatusTransacao.PENDENTE,"27 997676697");
        PagamentoCartao cartao1 = new PagamentoCartao(1, 2300.0,StatusTransacao.APROVADO,"1234567812345678");


        System.out.println("-----------\uD83D\uDC2E MOO PAY \uD83D\uDC2E-----------");


        System.out.println("ADICIONANDO TRANSAÇÕES: \n");
        processador.adicionar(pix1);
        processador.adicionar(cartao1);

        System.out.println("PROCESSANDO PAGAMENTOS...\n");
        processador.processarTodas();


        processador.exibirRelatorios();

        System.out.println("\nTRANSAÇÕES APROVADAS: ");
        List<Transacao> pendentes = processador.listarPorStatus(StatusTransacao.PENDENTE);
        for(Transacao t : pendentes){
            System.out.println(" - " + t);
        }

        System.out.println("\n" + processador);

    }
}
