package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
