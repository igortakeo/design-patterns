public class Tv implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public void disable() {
        this.on = false;        
    }

    @Override
    public void enable() {
        this.on = true;        
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public boolean isEnabled() {
        return this.on;
    }

    @Override
    public void printStatus() {
        System.out.println("------------------------------------");
        System.out.println("| I'm TV set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| Current volume is " + volume + "%");
        System.out.println("| Current channel is " + channel);
        System.out.println("------------------------------------\n");
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;        
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100){
            this.volume = 100;
        }
        else if (volume < 0) {
            this.volume = 0;
        }
        else {
            this.volume = percent;
        }        
    }
    
}
