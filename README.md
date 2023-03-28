# Factory Method Example

### A sample project for Factory Method Design Pattern!

## How does it work?

 In This little project, the example of a transpotation system is modeled from: https://refactoring.guru/design-patterns/factory-method

A Transport interface is created including two methods: getDeliveryTime(), getDeliveryType()

A Ship and a Truck abstract class implement the Transport interface.
 
A CargoBoat and a BigBoat extends from Ship class.

A CargoTruck and a BigTruck extends from Truck class.

A Consignment and a Customer class is created to use transportation system.
