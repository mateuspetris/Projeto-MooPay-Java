package mooPay;

public abstract class Transacao {

    private int id;
    private double valor;
    private StatusTransacao status;

    public abstract void processarPagamento();

    public Transacao() {

    }


    public Transacao(int id, double valor, StatusTransacao status) {
        this.id = id;
        this.valor = valor;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public double getValor() {
        return valor;
    }

    public StatusTransacao getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setStatus(StatusTransacao status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Id transação: %d | Valor: R$ %.2f | Status: %s "
                , id, valor, status);
    }
}
