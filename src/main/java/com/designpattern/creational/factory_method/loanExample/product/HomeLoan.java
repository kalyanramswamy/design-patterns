package com.designpattern.creational.factory_method.loanExample.product;

/* Concrete Product */
public class HomeLoan extends Loan {
    @Override
    double getInterestRate() {
        return 8;
    }
}
