# Java Payment Strategy Pattern

Este projeto é uma implementação prática do padrão de projeto **Strategy** em Java, aplicado a um sistema simples de processamento de pagamentos. 

## Descrição

O padrão Strategy permite que uma família de algoritmos seja definida e que eles possam ser intercambiáveis dentro do contexto onde são usados. Neste projeto, diferentes estratégias de pagamento (Cartão de Crédito, PayPal e PIX) são implementadas e podem ser trocadas dinamicamente.

## Tecnologias

- Java 21
- Maven para gerenciamento de dependências e build

## Estrutura do projeto

- `PaymentStrategy` - Interface para as estratégias de pagamento.
- `CreditCardPayment` - Implementação de pagamento com cartão de crédito.
- `PayPalPayment` - Implementação de pagamento via PayPal.
- `PixPayment` - Implementação de pagamento via PIX.
- `PaymentProcessor` - Classe que utiliza as estratégias para processar pagamentos.
- `Main` - Classe principal para demonstrar o uso do padrão Strategy.

## Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/java-payment-strategy-pattern.git
   cd java-payment-strategy-pattern
   mvn clean install
   mvn exec:java
