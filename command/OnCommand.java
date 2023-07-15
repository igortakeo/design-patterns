public class OnCommand implements Command {
    
    private DeviceInterface device;

    public OnCommand(DeviceInterface device) {
        this.device = device;
    }

    @Override
    public void execute(){
        this.device.on();
    }
}
