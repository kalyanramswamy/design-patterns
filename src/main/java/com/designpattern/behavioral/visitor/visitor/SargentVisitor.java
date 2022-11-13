package com.designpattern.behavioral.visitor.visitor;

import com.designpattern.behavioral.visitor.elements.*;

public class SargentVisitor extends AbstractUnitVisitor {
    @Override
    public void visitSoldier(Soldier soldier) {
        // Do Nothing
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        System.out.println("Greetings Sergeant");
    }

    @Override
    public void visitCommander(Commander commander) {
        // Do Nothing
    }
}
