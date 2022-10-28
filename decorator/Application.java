import java.util.HashMap;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Notifier notifier = new Notifier();
        notifier.send("Test notifier");

        HashMap<String, Boolean> channels = readConfiguration();

        BaseDecorator wrapper = ConfigureNotifier(notifier, channels);

        wrapper.send("Test notifier configured");
    }

    public static BaseDecorator ConfigureNotifier(Notifier notifier, HashMap<String, Boolean> channels) {
        BaseDecorator wrapper = new BaseDecorator(notifier);

        if(channels.get("SMS")) wrapper = new SmsDecorator(wrapper);
        if(channels.get("Facebook")) wrapper = new FacebookDecorator(wrapper);
        if(channels.get("Slack")) wrapper = new SlackDecorator(wrapper);
        
        return wrapper;
    }

    public static HashMap<String, Boolean> readConfiguration() {
        HashMap<String, Boolean> channels = new HashMap<String, Boolean>();
        Scanner scanner = new Scanner(System.in);
        String ans = new String();

        System.out.print("Do you want to allow SMS notification? (y/n): ");
        ans = scanner.nextLine();
        channels.put("SMS", ans.equals("y") ? true : false);

        System.out.print("Do you want to allow Facebook notification? (y/n): ");
        ans = scanner.nextLine();
        channels.put("Facebook", ans.equals("y") ? true : false);

        System.out.print("Do you want to allow Slack notification? (y/n): ");
        ans = scanner.nextLine();
        channels.put("Slack", ans.equals("y") ? true : false);

        scanner.close();

        return channels;
    }

}
