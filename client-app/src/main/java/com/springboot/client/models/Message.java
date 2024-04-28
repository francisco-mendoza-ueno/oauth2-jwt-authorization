package com.springboot.client.models;

public class Message {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;

    public Message() {
    }

    public Message(String text) {
        this.text = text;
    }
}
