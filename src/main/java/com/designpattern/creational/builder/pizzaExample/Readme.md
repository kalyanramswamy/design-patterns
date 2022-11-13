# Advanced Builder Example

![Builder](https://refactoring.guru/images/patterns/diagrams/builder/structure-2x.png)


- Builder
	- The Builder interface declares product construction steps that are common to all types of builders.

- ConcreteBuilder
	- Concrete Builders provide different implementations of the construction steps. Concrete builders may produce products that don’t follow the common interface.

- Director
	- Constructs an object using the Builder interface.

- Product
	- The Director class defines the order in which to call construction steps, so you can create and reuse specific configurations of products.

- Client
	- The Client must associate one of the builder objects with the director. Usually, it’s done just once, via parameters of the director’s constructor. 
	Then the director uses that builder object for all further construction. However, there’s an alternative approach for when the client passes the builder 
	object to the production method of the director. In this case, you can use a different builder each time you produce something with the director.



	
#### References
-  [https://refactoring.guru/design-patterns/builder](https://refactoring.guru/design-patterns/builder)
-  Pizza Example: [https://sourcemaking.com/design_patterns/builder/java/2](https://sourcemaking.com/design_patterns/builder/java/2)
-  Pizza Example medium: [https://medium.com/@andreaspoyias/design-patterns-a-quick-guide-to-builder-pattern-a834d7cacead](https://medium.com/@andreaspoyias/design-patterns-a-quick-guide-to-builder-pattern-a834d7cacead)

