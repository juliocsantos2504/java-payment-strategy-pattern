package com.meuprojeto;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando sistema de pagamentos...");

        PaymentProcessor processor = new PaymentProcessor();

        processor.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432", "João Silva"));
        processor.processPayment(250.0);

        processor.setPaymentStrategy(new PayPalPayment("joao@email.com"));
        processor.processPayment(100.0);

        processor.setPaymentStrategy(new PixPayment("11999999999"));
        processor.processPayment(50.0);
    }
}
