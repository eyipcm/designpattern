# [Design pattern](https://refactoring.guru/design-patterns/java)

## [Creation pattern](https://refactoring.guru/design-patterns/creational-patterns)

Creational design patterns provide various object creation mechanisms, which increase flexibility and reuse of existing code.
	
 1.	<i><u>Abstract Factory Method</u></i> - Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 2.	<i><u>Factory Method</u></i> - Define an interface for creating an object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
 3.	Builder - Separate the construction of a complex object from its representation so that the same construction process can create different representations. 
 4.	Prototype - Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.
 5.	Singleton - Ensure a class only has one instance, and provide a global point of access to it.
 
----

## [Structural pattern](https://refactoring.guru/design-patterns/structural-patterns)

Structural design patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient

 1.	<u><i>Adapter</i></u> - Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
 2.	Bridge - Decouple an abstraction from its implementation so that the two can vary independently.
 3.	<u><i>Composite</i></u> - Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
 4.	<u><i>Decorator</i></u> - Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
 5.	Facade - Provide a unified interface to a set of interfaces in a subsystem. FaÃ§ade defines a higher-level interface that makes the subsystem easier to use.
 6.	Flyweight - Use sharing to support large numbers of fine-grained objects efficiently.
 7.	Proxy - Provide a surrogate (n. 代理人)  or placeholder for another object to control access to it.
 
----

## [Behavioral pattern](https://refactoring.guru/design-patterns/behavioral-patterns)

Behavioral design patterns are concerned with algorithms and the assignment of responsibilities between objects.

 1.	Chain of Responsibility - Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.
 2.	Command - Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.
 3.	Interpreter - Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.
 4.	Iterator - Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
 5.	Mediator (n. 調解人) - Define an object that encapsulates how a set of objects interact.
Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their interaction independently.
 6.	Memento (n. 紀念品/令人回憶的東西) - Without violating encapsulation, capture and externalize an object's internal state so that the object can be restored to this state later.
 7.	<u><i>Observer</i></u> - Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
 8.	State - Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.
 9.	<u><i>Strategy</i></u> - Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.
 10. <u><i>Template Method</i></u> - Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.
 11. Visitor - Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

----

|&nbsp;|&nbsp;| Creational | Structural | Behavioral|
|:---|:---|:---|:---|:---|
|Scope |Class|Factory Method|Adapter|Interpreter|
|&nbsp;|&nbsp;|&nbsp;|&nbsp;| Template Method|
|&nbsp;| Object | Abstract Factory | Adapter     | Chain of Responsibility|
|      |        | Builder          | Bridge     | Command|
|      |        | Prototype        | Composite  | Iterator|
|      |        | Singleton        | Decorator  | Mediator|
|      |        |                  | Facade     | Memento|
|      |        |                  | Flyweight  | Observer|
|      |        |                  | Proxy      | Observer|
|      |        |                  |            | State|
|      |        |                  |            | Strategy|
|      |        |                  |            | Visitor|

----
### Commonly Used Pattern 

Abstract Factory (page 87)
Adapter (139)
Composite (163)
Decorator (175)
Factory Method (107)
Observer (293)
Strategy (315)
Template Method (325)

----

```java
package com.aypc.adapter;

import com.aypc.structiural.adapter.*;
import com.aypc.structural.adapter.*;

public class AdapterDemo {
  public static void main(String[] args) {
    Shape[] shapes = {new RectangleAdapter(new Rectangle()), new LineAdapter(new Line())};
    int x1 = 10, y1 = 20;
    int x2 = 30, y2 = 60;
    for (Shape shape : shapes) {
      shape.draw(x1, y1, x2, y2);
    }
  }
} 
```
----

### Abstract Factory Method ###
buttons: First __product hierarchy__

buttons/Button.java

```java
/**
 * Abstract Factory assumes that you have several families of products,
 * structured into separate class hierarchies (Button/Checkbox). All products of
 * the same family have the common interface.
 *
 * This is the common interface for buttons family.
 */
public interface Button {
    void paint();
}
```

buttons/MacOSButton.java
 
```java
/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
```

buttons/WindowsButton.java

```java
/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
```

checkboxes: Second __product hierarchy__

checkboxes/Checkbox.java

```java
/**
 * Checkboxes is the second product family. It has the same variants as buttons.
 */
public interface Checkbox {
    void paint();
}
```

checkboxes/MacOSCheckbox.java

```java
/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
```

checkboxes/WindowsCheckbox.java

```java
/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */
public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
```

factories

factories/GUIFactory.java: Abstract factory

```java
/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
```

factories/MacOSFactory.java: Concrete factory (macOS)

```java
/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
```

factories/WindowsFactory.java: Concrete factory (Windows)

```java
/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
```

app

app/Application.java: Client code

```java
/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
```

Demo.java: App configuration

```java

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
```

----

### Factory Method ###

buttons: Common product interface

```java
/**
 * Common interface for all buttons.
 */
public interface Button {
    void render();
    void onClick();
}
```

buttons: Concrete product

```java
/**
 * HTML button implementation.
 */
public class HtmlButton implements Button {

    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
```

buttons: One more concrete product

```java
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Windows button implementation.
 */
public class WindowsButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick();
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
        onClick();
    }

    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
```

factory: Base creator

```java
/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
public abstract class Dialog {

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
```

factory: Concrete creator

```java
/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
```

factory: One more concrete creator

```java
/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
```

Client code

```java
/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
```
----

### Builder ###

builders/Builder.java: Common builder interface

```java
/**
 * Builder interface defines all possible ways to configure a product.
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
```

builders/CarBuilder.java: Builder of car

```java
/**
 * Concrete builders implement steps defined in the common interface.
 */
public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
```

cars/Car.java: Car product

```java
/**
 * Car is a product class.
 */
public class Car {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;
    private double fuel = 0;

    public Car(Type type, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.tripComputer.setCar(this);
        this.gpsNavigator = gpsNavigator;
    }

    public Type getType() {
        return type;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public TripComputer getTripComputer() {
        return tripComputer;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }
}
```

cars/Manual.java: Manual product

```java
/**
 * Car manual is another product. Note that it does not have the same ancestor
 * as a Car. They are not related.
 */
public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
```

cars/Type.java

```java
package refactoring_guru.builder.example.cars;

public enum Type {
    CITY_CAR, SPORTS_CAR, SUV
}
```

*components*

components/Engine.java: Product feature 1

```java
/**
 * Just another feature of a car.
 */
public class Engine {
    private final double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage) {
        this.volume = volume;
        this.mileage = mileage;
    }

    public void on() {
        started = true;
    }

    public void off() {
        started = false;
    }

    public boolean isStarted() {
        return started;
    }

    public void go(double mileage) {
        if (started) {
            this.mileage += mileage;
        } else {
            System.err.println("Cannot go(), you must start engine first!");
        }
    }

    public double getVolume() {
        return volume;
    }

    public double getMileage() {
        return mileage;
    }
}
```

components/GPSNavigator.java: Product feature 2

```java
/**
 * Just another feature of a car.
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
```

components/Transmission.java: Product feature 3

```java
/**
 * Just another feature of a car.
 */
public enum Transmission {
    SINGLE_SPEED, MANUAL, AUTOMATIC, SEMI_AUTOMATIC
}
```

components/TripComputer.java: Product feature 4

```java
/**
 * Just another feature of a car.
 */
public class TripComputer {

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuelLevel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

    public void showStatus() {
        if (this.car.getEngine().isStarted()) {
            System.out.println("Car is started");
        } else {
            System.out.println("Car isn't started");
        }
    }
}
```

*director*

director/Director.java: Director controls builders

```java
/**
 * Director defines the order of building steps. It works with a builder object
 * through common Builder interface. Therefore it may not know what product is
 * being built.
 */
public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setType(Type.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setType(Type.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setType(Type.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
```

Demo.java: Client code

```java
/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    public static void main(String[] args) {
        Director director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
```

----

[Builder vs Abstract Factory](http://rockssdlog.blogspot.hk/2012/05/design-pattern-builder-pattern.html)

其中的Director就是負責執行各步驟並產出產品，Builder則確保了其繼承者都會有N個步驟

最後，如果有人因為看到Builder中包含了多個建置方法，而覺得會跟Abstract Factory搞混，這裡整理了Builder Pattern與Abstract Factory Pattern的不同：

1) Builder著重在隱藏複雜的建置步驟，最後只傳回一個產品。

2) Abstract Factory則是為了維護一系列產品的關聯，會產出某系列的多項產品。

3) Builder模式中，Client不需要認識各個零件的型態。（只要『吃』產出的餐點）

4) Abstract Factory中，Client認識各項的抽象型別或介面，並能使用它們。

----

 ![Object Oriented Design](https://2.bp.blogspot.com/-Rrydpzw_mco/Vo90k2rbcAI/AAAAAAABAlU/dvO7pATGcrU/s1600/OO%2B%25E7%2589%25A9%25E4%25BB%25B6%25E5%25B0%258E%25E5%2590%2591.gif "Object Oriented Design") 

 ![equation](https://latex.codecogs.com/gif.latex?\Large&space;x=\frac{-b\pm\sqrt{b^2-4ac}}{2a})
 
 ![equation](https://latex.codecogs.com/gif.latex?f%28n%29%20=%20a_1 f%28n-1%29+a_2 f%28n-2%29 + %20\dotsm%20 + a_d f%28n-d%29)
 
 ![formula](https://latex.codecogs.com/gif.latex?f%28n%29%20=%20a_1 f%28n-1%29+a_2 f%28n-2%29 + %20\dotsm%20 + a_d f%28n-d%29)
 
----

&gt; 這是一個block quote的文塊, 用來示範如何使用block quote的一個例子.
&gt; 如果在email裡用過block quote, 就應該覺得這不陌生.
&gt; 下一行空著就變新的一個段落
&gt;
&gt; 新的段落.

* item 1
* item 2
- item 3
- item 4
+ item 5
+ item 6

1. pen
2. pencil
3. marker

* * *

***

*****

- - -

----

*斜體*

_斜體_

**粗體**

__粗體__


Weekly Project Progress Report
==============================
* Record Date :
* manager :
* owner :
* recorder :

### A. Goal ###
------------------
1. development and deployment
2. MIS training

### B. Progress Report ###
------------------
1. System Deployment : using Application Server
...[in detail](http://mropengate.blogspot.tw/)

2. MIS training :
 1. DHCP &amp; DNS Server
 ...[in detail](http://mropengate.blogspot.tw/)
 2. IDC
 3. Proximity Access Control System
 * information

### C. Action Item ###
------------------


| NumID | Action | Owner | Deadline | status |
| ---- | ---- | ---- | ---- | ---- |
| NUM | SAMPLE TASK | CHONG | DATE | ONGOING |

| Tables   |      Are      |  Cool |
|----------|:-------------:|------:|
| col 1 is |  left-aligned | $1600 |
| col 2 is |    centered   |   $12 |
| col 3 is | right-aligned |    $1 |

|   |   |   |   |   |   |
|---|---|---|---|---|---|
|   |   |   |   |   |   |
|   |   |   |   |   |   |
|   |   |   |   |   |   |
|   |   |   |   |   |   |

 [I'm an inline-style link with title](https://www.google.com "Google's Homepage") 
 
 
[![An old rock in the desert](/assets/images/shiprock.jpg "Shiprock, New Mexico by Beau Rogers")](https://www.flickr.com/photos/beaurogers/31833779864/in/photolist-Qv3rFw-34mt9F-a9Cmfy-5Ha3Zi-9msKdv-o3hgjr-hWpUte-4WMsJ1-KUQ8N-deshUb-vssBD-6CQci6-8AFCiD-zsJWT-nNfsgB-dPDwZJ-bn9JGn-5HtSXY-6CUhAL-a4UTXB-ugPum-KUPSo-fBLNm-6CUmpy-4WMsc9-8a7D3T-83KJev-6CQ2bK-nNusHJ-a78rQH-nw3NvT-7aq2qf-8wwBso-3nNceh-ugSKP-4mh4kh-bbeeqH-a7biME-q3PtTf-brFpgb-cg38zw-bXMZc-nJPELD-f58Lmo-bXMYG-bz8AAi-bxNtNT-bXMYi-bXMY6-bXMYv)
