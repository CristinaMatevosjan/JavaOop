import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ICQ icq = new ICQ();
        User client1 = new User("Маша Иванова", icq);
        User client2 = new User("Петя Васечкин", icq);
        User client4 = new User("Сережа Сидоров", icq);
        icq.appendClient(client1);
        icq.appendClient(client2);
        icq.appendClient(client4);

        client1.sendMsg("Привет! Как дела?");
        client2.sendMsg("Хай");
        User client3 = new User("Катя Петрова", icq);
        icq.appendClient(client3);

        client3.sendMsg("hello world!");
    }
}




