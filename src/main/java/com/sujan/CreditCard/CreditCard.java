package com.sujan.CreditCard;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreditCard {

    @JsonProperty("CardNumber")
    @JsonAlias({"cardNumber", "CARD_NUMBER"})
    private String cardNumber;

    @JsonProperty("ExpirationDate")
    @JsonAlias({"expirationDate", "EXPIRATION_DATE"})
    private String expirationDate;
    
    @JsonProperty("NameOfCardholder")
    @JsonAlias({"cardHolderName", "CARD_HOLDER_NAME"})
    private String nameOfCardholder;

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getNameOfCardholder() {
        return nameOfCardholder;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setNameOfCardholder(String nameOfCardholder) {
        this.nameOfCardholder = nameOfCardholder;
    }
}