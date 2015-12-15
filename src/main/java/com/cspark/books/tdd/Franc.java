package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class Franc extends Money {

    private String currency;

    public Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public String currency() {
        return currency;
    }

}
