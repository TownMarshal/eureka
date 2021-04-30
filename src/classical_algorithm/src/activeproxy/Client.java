package activeproxy;

/*JDK动态代理*/
public class Client {
    public static void main(String[] args) {
        LogHandler logHandler = new LogHandler();
        UserManager userManager = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
        userManager.addUser("111111", "胡峥");
    }
}
