package com.sujan.CreditCard;

public class CreditCardFactory {
    public CreditCard getCreditCard(String cardNumber) {
        if(cardNumber.contains("*")) {
            throw new UnsupportedOperationException("Invalid: non numeric characters");
        } else if(cardNumber.length() > 19) {
            throw new UnsupportedOperationException("Invalid: more than 19 digits");
        } else if(cardNumber.isEmpty()) {
            throw new UnsupportedOperationException("Invalid: empty/null card number");
        } else if (MasterCreditCard.isValid(cardNumber)) {
            return new MasterCreditCard();
        } else if (VisaCreditCard.isValid(cardNumber)) {
            return new VisaCreditCard();
        } else if (AmexCreditCard.isValid(cardNumber)) {
            return new AmexCreditCard();
        } else if (DiscoverCreditCard.isValid(cardNumber)) {
            return new DiscoverCreditCard();
        } else {
            throw new UnsupportedOperationException("Invalid: not a possible card number");
        }
    }
}