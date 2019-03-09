package com.example.dCipher.groupChat;

import java.util.Date;

public class ChatMessage {
    private String messageText;
    private String messageUser;
    private String messageUserFullName;
    private long messageTime;

    public ChatMessage(String messageText, String messageUser, String messageUserFullName) {
        this.messageText = messageText;
        this.messageUser = messageUser;
        this.messageUserFullName = messageUserFullName;

        messageTime =new Date().getTime();
    }

    public ChatMessage() {
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageUser() {
        return messageUser;
    }

    public String getMessageUserFullName() {
        return messageUserFullName;
    }

    public void setMessageUser(String messageUser) {
        this.messageUser = messageUser;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
