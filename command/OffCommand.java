public class OffCommand implements Command {
    
    private DeviceInterface device;

    public OffCommand(DeviceInterface device) {
        this.device = device;
    }

    @Override
    public void execute(){
        this.device.off();
    }
}
