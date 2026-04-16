public abstract class Remote {
    protected Device device;

    protected Remote(Device device) { this.device = device; }

    public abstract void togglePower();
}
