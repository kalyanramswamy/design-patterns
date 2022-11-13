package com.designpattern.behavioral.visitor.elements;

import com.designpattern.behavioral.visitor.visitor.AbstractUnitVisitor;

import java.util.Arrays;

public abstract class AbstractUnit {
    private AbstractUnit[] units;

    public AbstractUnit(AbstractUnit... units) {
        this.units = units;
    }

    public void accept(AbstractUnitVisitor visitor) {
        Arrays.asList(units).forEach(unit -> unit.accept(visitor));
    }
}
