package com.meuprojeto;

public class PaymentProcessor {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void processPayment(double amount) {
        if (strategy == null) {
            System.out.println("Nenhuma estratégia de pagamento definida!");
            return;
        }
        strategy.pay(amount);
    }
}