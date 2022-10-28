public class FacebookDecorator extends BaseDecorator {

    public FacebookDecorator(InterfaceNotifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        System.out.println("Facebook: " + message);
        super.send(message);
    }
    
}
