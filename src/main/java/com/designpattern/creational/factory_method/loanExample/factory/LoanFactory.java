package com.designpattern.creational.factory_method.loanExample.factory;

import com.designpattern.creational.factory_method.loanExample.product.EducationLoan;
import com.designpattern.creational.factory_method.loanExample.product.HomeLoan;
import com.designpattern.creational.factory_method.loanExample.product.Loan;
import com.designpattern.creational.factory_method.loanExample.util.LoanType;

/* Factory Method */
public class LoanFactory {
    public Loan getLoan(LoanType loanType) {
        switch (loanType) {
            case HOME_LOAN:
                return new HomeLoan();
            case EDUCATION_LONE:
                return new EducationLoan();
            default:
                return null;
        }
    }
}
