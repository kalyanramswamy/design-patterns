package com.designpattern.behavioral.visitor;

import com.designpattern.behavioral.visitor.elements.AbstractUnit;
import com.designpattern.behavioral.visitor.elements.Commander;
import com.designpattern.behavioral.visitor.elements.Sergeant;
import com.designpattern.behavioral.visitor.elements.Soldier;
import com.designpattern.behavioral.visitor.visitor.CommanderVisitor;
import com.designpattern.behavioral.visitor.visitor.SargentVisitor;
import com.designpattern.behavioral.visitor.visitor.SoldierVisitor;

public class Client {
    public static void main(String[] args) {
        AbstractUnit unitComposite = new Commander(
            new Sergeant(new Soldier(), new Soldier()),
            new Sergeant(new Soldier(), new Soldier())
        );

        unitComposite.accept(new CommanderVisitor());
        unitComposite.accept(new SargentVisitor());
        unitComposite.accept(new SoldierVisitor());
    }
}
