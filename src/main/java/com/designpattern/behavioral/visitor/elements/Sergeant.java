package com.designpattern.behavioral.visitor.elements;

import com.designpattern.behavioral.visitor.visitor.AbstractUnitVisitor;

public class Sergeant extends AbstractUnit {
    public Sergeant(AbstractUnit... sergeants){
        super(sergeants);
    }

    @Override
    public void accept(AbstractUnitVisitor visitor) {
        visitor.visitSergeant(this);
        super.accept(visitor);
    }
}
