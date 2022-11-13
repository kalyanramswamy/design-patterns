package com.designpattern.behavioral.visitor.visitor;

import com.designpattern.behavioral.visitor.elements.Commander;
import com.designpattern.behavioral.visitor.elements.Sergeant;
import com.designpattern.behavioral.visitor.elements.Soldier;

public class CommanderVisitor extends AbstractUnitVisitor {
    @Override
    public void visitSoldier(Soldier soldier) {
        // Do Nothing
    }

    @Override
    public void visitSergeant(Sergeant sergeant) {
        // Do Nothing
    }

    @Override
    public void visitCommander(Commander commander) {
        System.out.println("Greetings Commander");
    }
}
