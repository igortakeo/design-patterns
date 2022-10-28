public class BaseDecorator implements InterfaceNotifier {
    private InterfaceNotifier wrappee;

    public BaseDecorator(InterfaceNotifier wrappee) {
        this.wrappee = wrappee;
    }
 
    @Override
    public void send(String message) {
        wrappee.send(message);        
    }

}
