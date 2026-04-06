package com.codewithmosh;

import com.codewithmosh.Intefaz.ChatMediator;
import com.codewithmosh.impl.ChatMediatorImpl;
import com.codewithmosh.impl.UserImpl;
import com.codewithmosh.impl.User;

public class Main {
    public static void main() {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Renso");
        User user2 = new UserImpl(mediator, "Adrian");
        User user3 = new UserImpl(mediator, "Jose M.");
        User user4 = new UserImpl(mediator, "The Goat");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hola a todos.");
    }
}
