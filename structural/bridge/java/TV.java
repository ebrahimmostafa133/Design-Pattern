public class TV implements Device {
    private boolean on = false;

    @Override
    public void turnOn() { on = true; System.out.println("TV: turned on"); }

    @Override
    public void turnOff() { on = false; System.out.println("TV: turned off"); }

    @Override
    public boolean isOn() { return on; }
}
