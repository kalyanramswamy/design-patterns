package com.designpattern.behavioral.visitor.elements;

import com.designpattern.behavioral.command.simpleExample.command.Command;
import com.designpattern.behavioral.visitor.visitor.AbstractUnitVisitor;

public class Commander extends AbstractUnit {

    public Commander(AbstractUnit... commanders) {
        super(commanders);
    }

    @Override
    public void accept(AbstractUnitVisitor visitor) {
        visitor.visitCommander(this);
        super.accept(visitor);
    }
}
