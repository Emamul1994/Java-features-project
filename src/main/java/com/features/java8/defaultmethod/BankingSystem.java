package com.features.java8.defaultmethod;

interface PaymentProcessor {
    void processPayment();

    default void paymentRefund() {
        System.out.println("Refund payment");
    }

    static boolean validatePaymentDetails(String paymentDetails) {
        return paymentDetails != null && !paymentDetails.isEmpty();
    }
}

class CreditCardPaymentProcessor implements PaymentProcessor {
    @Override
    public void processPayment() {
        System.out.println("Payment is processing");
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new CreditCardPaymentProcessor();
        paymentProcessor.processPayment();
        paymentProcessor.paymentRefund();
        boolean creditCardFlag = PaymentProcessor.validatePaymentDetails("Credit Card Details");
        System.out.println("Credit Card Valid: " + creditCardFlag);
    }
}
