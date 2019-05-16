package com.example.fragmentlist.models;

import java.io.Serializable;

public class Mail implements Serializable {
    private String subject;
    private String message;
    private String senderName;

    public Mail(String subject, String message, String senderName) {
        this.subject = subject;
        this.message = message;
        this.senderName = senderName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }
}
