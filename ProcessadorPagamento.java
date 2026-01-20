package mooPay;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorPagamento <T extends Transacao> {

    private List<T> transacoes;

    public ProcessadorPagamento() {
        this.transacoes = new ArrayList<T>();
    }

    public void adicionarTransacao(T transacao) {
        this.transacoes.add(transacao);
    }

    public void processarTodas() {
        for (T transacao : transacoes) {
            transacao.processarPagamento();
        }
    }

    public List<T> filtrarStatus(StatusTransacao status) {
        List<T> filtradas = new ArrayList<>();
        for (T transacao : transacoes) {
            if (transacao.getStatus() == status) {
                filtradas.add(transacao);
            }
        }
        return filtradas;
    }

    public double totalValor() {
        double total = 0;
        for (T transacao : transacoes) {
            total = total + transacao.getValor();
        }
        return total;
    }

    public void exibirRelatorios() {
        System.out.println("\n====== RELATORIOS ======");
        for (T transacao : transacoes) {
            System.out.println(transacao);
        }
        System.out.println("\nTOTAL DE TRANSAÇÕES: " + transacoes.size());
        System.out.println("VALOR TOTAL: R$ " + totalValor());
    }

    @Override
    public String toString() {
        return String.format("PROCESSADOR DE PAGAMENTOS - %d transacoes cadastradas, Valor total: R$ %.2f ", transacoes.size(), totalValor());
    }

}
