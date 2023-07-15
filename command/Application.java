public class Application {
    public static void main(String[] args) {
        TvDevice tvDevice = new TvDevice();
        OnCommand onCommand = new OnCommand(tvDevice);
        OffCommand offCommand = new OffCommand(tvDevice);

        Button onButton = new Button(onCommand);
        Button offButton = new Button(offCommand);

        onButton.press();
        offButton.press();
    }
}
