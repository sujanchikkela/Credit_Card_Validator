package com.sujan.CreditCard;

public class VisaCreditCard extends CreditCard {

    @Override
    public String toString() {
        return "Visa";
    }

    public static boolean isValid(String cardNumber) {
        return cardNumber.length() == 13 ||
                cardNumber.length() == 16 &&
                        cardNumber.charAt(0) == '4';
    }
}
