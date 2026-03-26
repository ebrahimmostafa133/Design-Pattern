package SOLID;

/**
 * I - Interface Segregation Principle (ISP)
 *
 * Concept:
 * A client should never be forced to implement an interface that it doesn't use.
 * 
 * This means it's better to have multiple specific, small "role" interfaces 
 * rather than one general-purpose "fat" interface.
 */

// ==========================================
// WRONG IMPLEMENTATION (Violating ISP)
// ==========================================
/*
 * We have a "fat" interface WorkerWrong that contains both work() and eat().
 * This forces any implementing class to provide logic for both.
 * A Robot worker has no use for eat(), but is forced to implement it anyway.
 */
interface WorkerWrong {
    void work();
    void eat();
}

class HumanWorkerWrong implements WorkerWrong {
    @Override
    public void work() {
        System.out.println("Human is working...");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating lunch...");
    }
}

class RobotWorkerWrong implements WorkerWrong {
    @Override
    public void work() {
        System.out.println("Robot is working securely...");
    }

    // A robot doesn't eat, but we must implement the method!
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robots do not eat!");
    }
}

// ==========================================
// CORRECT IMPLEMENTATION (Adhering to ISP)
// ==========================================
/*
 * We break the thick interface down into smaller, highly cohesive interfaces.
 * Now, classes only implement what they actually can do.
 */

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

// Human implements both because a human can both work and eat
class HumanWorker implements Workable, Eatable {
    @Override
    public void work() {
        System.out.println("Human working effectively...");
    }

    @Override
    public void eat() {
        System.out.println("Human eating a sandwich...");
    }
}

// Robot only implements Workable (It is completely unaware of the Eatable interface)
class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot working tirelessly 24/7...");
    }
}

public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        // Correct Usage Validation
        Workable robot = new RobotWorker();
        robot.work();
        // robot.eat(); // NOT ALLOWED, which is architecturally correct!
        
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat(); // Allowed
    }
}
