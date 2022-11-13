# DesignPattern


###  Types of Patterns

1. **Creational** : Creational design patterns abstract the instantiation process. 
They help make a system independent of how its objects are created,composed, and represented.
     - [Factory Method](src/main/java/com/designpattern/creational/factory_method): Subclass of object that is [instantiated](#head1234)
     - [Abstract Factory](src/main/java/com/designpattern/creational/abstract_factory): **Families** of product objects
     - [Builder](src/main/java/com/designpattern/creational/builder): How a **composite object** get created
     - [Prototype](src/main/java/com/designpattern/creational/prototype): Class of object that is [instantiated](#head1234)
     - [Singleton](src/main/java/com/designpattern/creational/singleton): The **sloe instance** of a class

2. **Structural** : Structural patterns are concerned with how classes and objects are composed to form larger structures. 
Structural class patterns use inheritance to compose interfacesor implementations.
    - [Adapter](src/main/java/com/designpattern/structural/adapter): Interface to an **object**
    - [Bridge](src/main/java/com/designpattern/structural/bridge): **Implementation** of an object
    - [Composite](src/main/java/com/designpattern/structural/composite): **Structure** and composition of an object
    - [Decorator](src/main/java/com/designpattern/structural/decorator): Responsibility of an **object** without subclassing
    - [Facade](src/main/java/com/designpattern/structural/facade): Interface to a **subsystem**
    - [Flyweight](src/main/java/com/designpattern/structural/flyweight): Storage cost of **objects**
    - [Proxy](src/main/java/com/designpattern/structural/proxy): How an object is **accessed**; its location 
    
3. **Behavioral**
    - [Chain Of Responsibility](src/main/java/com/designpattern/behavioral/chainOfResponsibility): Object that can **fulfill** a request 
    - [Command](src/main/java/com/designpattern/behavioral/command): When and how a request is **fulfilled** 
    - [Interpreter](src/main/java/com/designpattern/behavioral/interpreter): **Grammar and interpretation** of a language
    - [Iterator](src/main/java/com/designpattern/behavioral/iterator): How an aggregate's elements are **accessed, traversed**  
    - [Mediator](src/main/java/com/designpattern/behavioral/mediator): How and which objects **interact** with each other
    - [Memento](src/main/java/com/designpattern/behavioral/memento): What private information is stored outside an object, and when  
    - [Observer](src/main/java/com/designpattern/behavioral/observer): Number of objects that depend on another object; how the dependent objects **stay up to date**
    - [State](src/main/java/com/designpattern/behavioral/state): **states** of an object
    - [Strategy](src/main/java/com/designpattern/behavioral/strategy): an algorithm
    - [Template Method](src/main/java/com/designpattern/behavioral/templateMethod): **steps** of algorithm
    - [Visitor](src/main/java/com/designpattern/behavioral/visitor): operations that can be applied to object(s) **without changing their class(es)**


###### <a name="head1234">Simple meaning of instantiate is creating an object from class.</a>
    ClassName obj = new ClassName();