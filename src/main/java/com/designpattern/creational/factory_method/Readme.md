# Factory Method: Subclass of object that is instantiated
`Creational`

#### Structure

![image](https://miro.medium.com/max/938/1*q4F3FP62QuqGULsrM-4YfA.png)


- **Product** : it defines an abstract blueprint of objects the factory method creates.
- **Concrete Product** : sub-classes product and is the actual blueprint of objects which is created.
- **Creator** : it declares the factory method, which returns an object of type Product.
- **ConcreteCreator** : it overrides the factory method declared in Creator to return an instance of a ConcreteProduct.

for loan example:
- Product(Abstract Product): Loan
- Concrete Products: EducationLoan, HomeLoan
- Creator: LoanFactory
- ConcreteCreator: Client


#### Examples
1. [Loan Example](https://medium.com/@info.anikdey003/factory-method-design-pattern-277dd4bd3a11)
2. [Instagram Example](https://medium.com/lean-in-women-in-tech-india/understanding-the-factory-method-design-pattern-using-instagram-story-50aa1b56f5b0)