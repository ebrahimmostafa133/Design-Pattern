package SOLID;

/**
 * D - Dependency Inversion Principle (DIP)
 *
 * Concept:
 * High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * Abstractions should not depend on details. Details should depend on abstractions.
 * 
 * This effectively reduces the tight coupling between classes by depending on Interfaces
 * rather than concrete implementations.
 */

// ==========================================
// WRONG IMPLEMENTATION (Violating DIP)
// ==========================================
/*
 * The High-Level module (LightSwitchWrong) directly depends on the tightly coupled 
 * Low-Level module concrete class (LightBulbWrong).
 * If we want the switch to turn on a Fan instead of a LightBulb, we have to modify 
 * the Switch class directly. This is a rigid and brittle design.
 */
class LightBulbWrong {
    public void turnOn() {
        System.out.println("Bulb is ON");
    }
    public void turnOff() {
        System.out.println("Bulb is OFF");
    }
}

class LightSwitchWrong {
    // Tightly coupled to LightBulbWrong! 
    private LightBulbWrong bulb;

    public LightSwitchWrong() {
        this.bulb = new LightBulbWrong();
    }

    public void operate(boolean on) {
        if (on) {
            bulb.turnOn();
        } else {
            bulb.turnOff();
        }
    }
}

// ==========================================
// CORRECT IMPLEMENTATION (Adhering to DIP)
// ==========================================
/*
 * We introduce an abstraction (Switchable). 
 * Now the high-level class (Switch) depends only on the interface.
 * The low-level classes (LightBulb, Fan) also depend on (implement) the abstraction.
 */

// Abstraction
interface Switchable {
    void turnOn();
    void turnOff();
}

// Low-level module 1
class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("LightBulb is shining bright!");
    }

    @Override
    public void turnOff() {
        System.out.println("LightBulb is dark.");
    }
}

// Low-level module 2 (A new extension added without modifying Switch!)
class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is spinning fast!");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is stopped.");
    }
}

// High-level module
// It no longer cares WHAT specific device it turns on/off.
// It relies completely on the generic Switchable interface.
class Switch {
    private Switchable device;

    // Dependency Injection: Pass the dependency from outside
    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate(boolean on) {
        if (on) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}

public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        // We can create a bulb and "inject" it into the switch
        Switchable bulb = new LightBulb();
        Switch lightSwitch = new Switch(bulb);
        lightSwitch.operate(true);
        
        // We can create a fan and use the SAME switch logic without changing Switch code!
        Switchable fan = new Fan();
        Switch fanSwitch = new Switch(fan);
        fanSwitch.operate(true);
    }
}
