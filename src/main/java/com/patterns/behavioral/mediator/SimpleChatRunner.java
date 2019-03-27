package com.patterns.behavioral.mediator;


public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat simpleTextChat = new SimpleTextChat();

        User admin = new Admin(simpleTextChat,"Peter");
        User user1 = new SimpleUser(simpleTextChat, "Vasya");
        User user2 = new SimpleUser(simpleTextChat, "Kolya");

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUserToChat(user1);
        simpleTextChat.addUserToChat(user2);

        user1.sendMessage("Hello");
        admin.sendMessage("Bye");

    }
}
