package com.designpattern.creational.factory_method.loanExample.product;

/* Concrete Product */
public class EducationLoan extends Loan {

    @Override
    double getInterestRate() {
        return 7;
    }
}
