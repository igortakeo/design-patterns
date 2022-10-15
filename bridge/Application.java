public class Application {
    public static void main(String[] args) {
        Tv myTv = new Tv();
        Radio myRadio = new Radio();

        BasicRemote radioRemote = new BasicRemote(myRadio);
        radioRemote.power();
        radioRemote.channelUp();
        radioRemote.volumeUp();
        radioRemote.volumeUp();

        AdvancedRemote tvRemote = new AdvancedRemote(myTv);
        tvRemote.power();
        tvRemote.channelUp();
        tvRemote.channelUp();
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        tvRemote.mute();

        myRadio.printStatus();
        myTv.printStatus();

        tvRemote.volumeUp();
        tvRemote.volumeUp();
        tvRemote.volumeUp();
        tvRemote.channelUp();

        myTv.printStatus();
    }
}
