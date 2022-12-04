public class Application {
    public static void main(String []args) throws InterruptedException{
        Server server = new Server();
        server.register("admin@example.com", "admin123");
        server.register("igor@example.com", "igor123");

        Middleware middleware = Middleware.link(
            new ThrottlingMiddleware(2),
            new UserExistsMiddleware(server),
            new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);

        System.out.println("----Igor----");
        server.logIn("igor@example.com", "igor1");
        server.logIn("igor@example.com", "igor1");
        server.logIn("igor@example.com", "igor1");

        Thread.sleep(7000);
        System.out.println("----Igor Successful----");
        server.logIn("igor@example.com", "igor123");


        System.out.println("----Admin----");
        server.logIn("admin@example.com", "admin123");
    }
}