import javax.swing.text.StyledEditorKit.BoldAction;

public abstract class Middleware {
    private Middleware next;

    public static Middleware link(Middleware first, Middleware... chain) {
        Middleware head = first;

        for(Middleware nextMiddleware: chain) {
            head.next = nextMiddleware;
            head = nextMiddleware;
        }

        return first;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password){
        if(next == null){
            return true;
        }

        return next.check(email, password);
    }
}
