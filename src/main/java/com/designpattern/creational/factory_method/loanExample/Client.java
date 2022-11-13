package com.designpattern.creational.factory_method.loanExample;

import com.designpattern.creational.factory_method.loanExample.factory.LoanFactory;
import com.designpattern.creational.factory_method.loanExample.product.Loan;
import com.designpattern.creational.factory_method.loanExample.util.LoanType;

/* creator class */
public class Client {
    public static void main(String[] args) {
        LoanFactory loanFactory = new LoanFactory();

        Loan homeLone = loanFactory.getLoan(LoanType.HOME_LOAN);
        System.out.println(homeLone.calculateInterest(100));

        Loan educationLoan = loanFactory.getLoan(LoanType.EDUCATION_LONE);
        System.out.println(educationLoan.calculateInterest(100));
    }
}
