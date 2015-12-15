package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public class Sum implements Expression {
    public Money augend;
    public Money addend;

    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount
                + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }
}