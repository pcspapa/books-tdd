package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int multiplier) {
        return new Franc(amount * multiplier);
    }

}
