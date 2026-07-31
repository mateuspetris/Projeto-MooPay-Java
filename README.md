> Sistema simples de processamento de transações financeiras desenvolvido para praticar conceitos de Programação Orientada a Objetos em Java.


## Sobre o Projeto

É um sistema de pagamentos que simula o processamento de transações via **PIX** e **Cartão de Crédito**. 

Este projeto foi criado como exercício prático para aplicar conceitos fundamentais de POO (Programação Orientada a Objetos) aprendidos durante estudos de Java.

---

##  Arquitetura do Sistema

```
│
├── Transacao (abstract)
│   ├── id:  int
│   ├── valor:  double
│   ├── status: StatusTransacao
│   └── processarPagamento(): void (abstract)
│
├── PagamentoPix extends Transacao
│   ├── chave: String
│   └── processarPagamento(): void
│
├── PagamentoCartao extends Transacao
│   ├── numero: String
│   └── processarPagamento(): void
│
└── StatusTransacao (enum)
    ├── PENDENTE
    ├── APROVADO
    └── REJEITADO
```

##  Como Usar

### Pré-requisitos

- Java JDK 8 ou superior
- IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code)

### Executando o Projeto

1. Clone o repositório:
```bash
git clone https://github.com/seu-usuario/moo-pay.git
```

2. Abra o projeto na sua IDE

3. Execute a classe `Main.java`

### Exemplo de Uso

```java
import mooPay.PagamentoCartao;
import mooPay.PagamentoPix;
import mooPay.StatusTransacao;

// Criando transações
PagamentoPix pix = new PagamentoPix(1, 150.00, StatusTransacao.PENDENTE, "chave@email.com");
PagamentoCartao cartao = new PagamentoCartao(2, 299.90, StatusTransacao.PENDENTE, "1234567812345678");

// Processando pagamentos
pix.

processarPagamento();
cartao.

processarPagamento();

// Exibindo informações
System.out.

println(pix);
System.out.

println(cartao);
```

**Saída esperada:**
```
Processando pix de R$ 150.0 na Chave: chave@email.com
Pagamento de R$ 299.9 no Cartão final 5678

PagamentoPix{id=1, valor=150.0, status=APROVADO, chave='chave@email.com'}
PagamentoCartao{id=2, valor=299.9, status=APROVADO, numero='****5678'}
```

---

## Estrutura de Arquivos

```
src/
└── Projetos/
    ├── Main.java
    ├── Transacao.java
    ├── PagamentoPix.java
    ├── PagamentoCartao.java
    └── StatusTransacao.java
```


**Feito com ☕ e muito aprendizado**

</div>
