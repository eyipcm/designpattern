package com.aypc.creational.builder1;

/*Product*/
public class Message {
    private String sender;
    private String recipient;
    private String header;
    private String body;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String toString() {
        return
                "Sender: " + sender + "\n" +
                "Recipient: " + recipient + "\n" +
                "Header: " + header + "\n" +
                "Body: " + body ;

    }
}