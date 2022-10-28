public class SlackDecorator extends BaseDecorator {

    public SlackDecorator(InterfaceNotifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        System.out.println("Slack: " + message);
        super.send(message);
    }

}
