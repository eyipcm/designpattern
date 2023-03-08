package com.aypc.creational.builder1;

public class MMSMessageBuilder extends MessageBuilder {

    public void constructMessageHeader() {
       message.setHeader("MMS header");
    }

    public void constructMessageBody(String body) {
       message.setBody(body);
    }
}

