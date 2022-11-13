package com.designpattern.behavioral.visitor.visitor;

import com.designpattern.behavioral.visitor.elements.*;

public abstract class AbstractUnitVisitor {
    public abstract void visitSoldier(Soldier soldier);

    public abstract void visitSergeant(Sergeant sergeant);

    public abstract void visitCommander(Commander commander);
}
