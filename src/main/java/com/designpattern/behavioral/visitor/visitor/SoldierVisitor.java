package com.designpattern.behavioral.visitor.visitor;

import com.designpattern.behavioral.visitor.elements.*;

public class SoldierVisitor extends AbstractUnitVisitor {
    @Override
    public void visitSoldier(Soldier soldier) {
        System.out.println("Greetings soldier");
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        // do nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        // do nothing
    }
}
