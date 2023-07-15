public class TvDevice implements DeviceInterface {
    
    private Boolean isRunning;

    public TvDevice(){
        this.isRunning = false;
    } 

    public void on(){
        this.isRunning = true;
        System.out.println("Turning tv on");
    }

    public void off(){
        this.isRunning = false;
        System.out.println("Turning tv off");
    }
}
