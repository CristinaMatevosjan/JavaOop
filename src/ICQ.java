import java.util.ArrayList;

class ICQ implements Chat {

    ArrayList<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String text, User me) {

        for (User user : users) {
            if (user.name != me.name) {
                user.printMessage(text);
            }
        }
    }

    @Override
    public void appendClient(User client) {
        System.out.println("\n добавился в чат " + client.name);
        users.add(client);

    }
}