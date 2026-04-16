public class BasicRemote extends Remote {
    public BasicRemote(Device device) { super(device); }

    @Override
    public void togglePower() {
        if (device.isOn()) device.turnOff(); else device.turnOn();
    }
}
