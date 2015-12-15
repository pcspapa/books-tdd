package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class Franc extends Money {
    public int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }

    @Override
    public boolean equals(Object o) {
        Franc dollar = (Franc) o;
        return amount == dollar.amount;
    }

}
