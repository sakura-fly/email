package com.smailnet.eamil.Entity;

public class EmailMessage {

    private String subject;
    private String from;
    private String to;
    private String date;
    private String content;

    public EmailMessage(String subject, String from, String to, String date, String content){
        this.subject = subject;
        this.from = from;
        this.to = to;
        this.date = date;
        this.content = content;
    }

    public String getSubject() {
        return subject;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDate() {
        return date;
    }

    public String getContent() {
        return content;
    }
}
