public class Notifier implements InterfaceNotifier {

    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
    
}
