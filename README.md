# 🐮 Moo Pay

> Sistema de processamento de transações financeiras para praticar POO e Generics em Java. 

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Concluído-brightgreen?style=for-the-badge)
![POO](https://img.shields.io/badge/Conceito-POO-green?style=for-the-badge)

---
---

## 📋 Sobre o Projeto

O **Moo Pay** simula o processamento de transações via **PIX** e **Cartão de Crédito**, com um gerenciador genérico para controlar, filtrar e gerar relatórios. 

Projeto criado para praticar conceitos de **Programação Orientada a Objetos** e **Generics**. 

---

## 🎯 Conceitos Aplicados

- ✅ **Herança** - Classes filhas herdam de `Transacao`
- ✅ **Polimorfismo** - Diferentes comportamentos via `processarPagamento()`
- ✅ **Encapsulamento** - Atributos privados com controle de acesso
- ✅ **Classes Abstratas** - `Transacao` como base abstrata
- ✅ **Enums** - `StatusTransacao` (PENDENTE, APROVADO, REJEITADO)
- ✅ **Generics** - `ProcessadorPagamentos<T>` type-safe
- ✅ **Collections** - `List` e `ArrayList` para gerenciar transações

---

## 🏗️ Arquitetura

```
├── StatusTransacao (enum)
├── Transacao (abstract)
├── PagamentoPix extends Transacao
├── PagamentoCartao extends Transacao
└── ProcessadorPagamentos<T extends Transacao>
```

---

## 🚀 Funcionalidades

- 💳 **Pagamento via Cartão** - Exibe apenas últimos 4 dígitos
- 🔑 **Pagamento via PIX** - Processa com chave PIX
- 📊 **Processador Genérico** - Adiciona, processa, filtra e gera relatórios
- 🎭 **Polimorfismo** - Lista única processa diferentes tipos

---

## 💻 Como Usar

### Executando

```bash
git clone https://github.com/mateuspetris/Projeto-MooPay-Java.git
```

Abra na IDE e execute `Main.java`

### Exemplo de Código

```java
// Criar processador
ProcessadorPagamentos<Transacao> processador = new ProcessadorPagamentos<>();

// Adicionar transações
processador.adicionar(new PagamentoPix(1, 150.0, StatusTransacao. PENDENTE, "chave@email.com"));
processador.adicionar(new PagamentoCartao(2, 500.0, StatusTransacao. PENDENTE, "1234567812345678"));

// Processar e exibir relatório
processador.processarTodas();
processador.exibirRelatorios();

// Filtrar por status
List<Transacao> aprovadas = processador.listarPorStatus(StatusTransacao.APROVADO);
```

**Saída:**
```
✅ Adicionado: PagamentoPix{id=1, valor=150.0, status=PENDENTE... }
✅ Adicionado: PagamentoCartao{id=2, valor=500.0, status=PENDENTE...}

Processando pix de R$ 150.0 na Chave: chave@email.com
Pagamento de R$ 500.0 no Cartão final 5678

📊 ===== RELATÓRIO DE TRANSAÇÕES =====
... 
📝 Total de Transações:  2
💰 Valor Total:  R$ 650.0
```

---

## 📁 Estrutura

```
src/Projetos/
├── Main. java
├── StatusTransacao.java
├── Transacao.java
├── PagamentoPix. java
├── PagamentoCartao.java
└── ProcessadorPagamentos.java
```

---

## 🎓 Destaque:  Generics

```java
public class ProcessadorPagamentos<T extends Transacao> {
    private List<T> transacoes;
    public void adicionar(T transacao) { ... }
    public List<T> listarPorStatus(StatusTransacao status) { ... }
}
```

**Vantagens:**
- ✅ Type Safety - Erros em tempo de compilação
- ✅ Reutilização - Funciona com qualquer tipo de transação
- ✅ Sem Casting - Código mais limpo

---

## 🔮 Melhorias Futuras

- [ ] Mais formas de pagamento (Boleto, Débito)
- [ ] Validações robustas
- [ ] Persistência em arquivo/banco
- [ ] Tratamento de exceções
- [ ] Testes unitários (JUnit)
- [ ] Interface gráfica

---

## 🧠 Aprendizados

- **Generics** - Bounded types e type safety
- **Polimorfismo** - Classes abstratas e override
- **Encapsulamento** - Controle através de métodos
- **Collections** - Manipulação e filtros de listas
- **Boas práticas** - Código limpo e segurança de dados

---

## 👨‍💻 Autor

**Mateus Petris** 

📫 GitHub: [@mateuspetris](https://github.com/mateuspetris)
📫 Linkedin: [mateuspetris](https://www.linkedin.com/in/mateuspetris)

---

## 📝 Licença

MIT License - Use e aprenda livremente!

---

<div align="center">

### ⭐ Se gostou, deixe uma estrela! 

**Feito com ☕ e muito aprendizado**

</div>
