import java.util.ArrayList;

public class UsersContainer {
    private static ArrayList<User> users = new ArrayList<User>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static ArrayList getUsers() {
        return users;
    }

}
