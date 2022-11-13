package com.designpattern.behavioral.visitor.elements;

import com.designpattern.behavioral.visitor.visitor.AbstractUnitVisitor;

public class Soldier extends AbstractUnit {

    public Soldier(Soldier... soldiers) {
        super(soldiers);
    }

    @Override
    public void accept(AbstractUnitVisitor visitor) {
        visitor.visitSoldier(this);
        super.accept(visitor);
    }
}
