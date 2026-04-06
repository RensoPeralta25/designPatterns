package com.codewithmosh.Intefaz;

import com.codewithmosh.impl.User;

public interface ChatMediator {
    void sendMessage(String message, User user);
    void addUser(User user);
}
