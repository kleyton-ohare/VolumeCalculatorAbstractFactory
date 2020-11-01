# VolumeCalculatorAbstractFactory

This calculates the volume of three types of shapes: `Sphere`, `Cube` and a regular `Tetrahedron`.

Abstract Factory Design Pattern was implemented so that the creation of objects is not exposed to the client.

As a result, the client invokes only one static method from `FactoryProvider` which then manages the instantiation.

The main difference between *Abstract Factory* and *Factory* is that Abstract Factory does not need `switch` or `if...else...` statements to create an object.

Loose-coupling implementation is enforced by this design.

Here is the [link](https://kleyton-ohare.github.io/VolumeCalculatorAbstractFactory/) to Javadoc.

<br><br>

## UML
![UML](https://github.com/kleyton-ohare/VolumeCalculatorAbstractFactory/blob/master/img/VolumeCalculatorAbstractFactoryUML.png?raw=true)


The UML above shows `Sphere`, `Cube`, and `Tetrahedron` implementing `Shape` interface.

It also shows `SphereFactory`, `CubeFactory`, and `TetrahedronFactory` implementing `ShapeAbstractFactory` interface.

`Demo` is where the `main` method invokes `FactoryProvider` which then instantiate objects through `ShapeAbstractFactory`.

The executable jar file can be found [here](https://drive.google.com/drive/folders/1OASEOal5V2N9ivg1UV-NFBeJOlUUFtBP?usp=sharing).

<br><br>

### VolumeCalculatorFactory
I have also developed the **Factory** version for VolumeCalculatorAbstractFactory [here](https://github.com/kleyton-ohare/VolumeCalculatorFactory).