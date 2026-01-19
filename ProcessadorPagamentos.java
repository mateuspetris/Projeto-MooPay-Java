package Projetos;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorPagamentos<T extends Transacao>{

    // criação da lista
    private List<T> transacoes;

    public ProcessadorPagamentos(){
        transacoes = new ArrayList<>();
    }

    public void adicionar(T transacao){
        transacoes.add(transacao);
        System.out.println("Adicionado: " + transacao);
    }

    public void processarTodas(){
        for(T transacao : transacoes){
            transacao.processarPagamento();
        }
    }

    public List<T> listarPorStatus(StatusTransacao status){
        List <T> filtradas = new ArrayList<>();
        for(T transacao : transacoes){
            if(transacao.getStatus() == status){
                filtradas.add(transacao);
            }
        }
        return filtradas;
    }

    public double calcularValorTotal(){
        double total = 0.0;
        for(T transacao : transacoes){
            total = total + transacao.getValor();
        }
        return total;
    }

    public void exibirRelatorios(){
        System.out.println("\n==== RELATÓRIO ====  ");
        for(T transacao : transacoes){
            System.out.println(transacao);
        }
        System.out.println("\nTotal de Transações: " + transacoes.size());
        System.out.println("Valor Total: R$ " + calcularValorTotal());

    }

    @Override
    public String toString(){
        return "Processador de Pagamentos: " + transacoes.size() + " transações cadastradas, Valor Total: R$ " + calcularValorTotal();
     }



}
