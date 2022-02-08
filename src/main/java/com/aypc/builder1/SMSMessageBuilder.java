package com.aypc.builder1;

public class SMSMessageBuilder extends MessageBuilder {

    public void constructMessageHeader() {
        message.setHeader("SMS header");
    }

    public void constructMessageBody(String body) {
        message.setBody(body);
    }
}