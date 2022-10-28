public class SmsDecorator extends BaseDecorator {

    public SmsDecorator(InterfaceNotifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        System.out.println("SMS: " + message);
        super.send(message);
    }

}
