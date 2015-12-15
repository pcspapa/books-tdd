package com.cspark.books.tdd;

/**
 * Created by cspark on 2015. 12. 15..
 */
public interface Expression {

    Money reduce(Bank bank, String to);

    Expression plus(Expression addend);

    Expression times(int muliplier);
}
