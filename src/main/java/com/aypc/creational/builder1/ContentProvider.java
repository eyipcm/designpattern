package com.aypc.creational.builder1;

/* director */
public class ContentProvider {
    private MessageBuilder messageBuilder;

    public MessageBuilder getMessageBuilder() {
        return messageBuilder;
    }

    public void setMessageBuilder(MessageBuilder messageBuilder) {
        this.messageBuilder = messageBuilder;
    }

    public Message getMessage() {
        return messageBuilder.getMessage();
    }

    public Message createMessage( MessageBuilder messageBuilder, String sender, String recipient,String message) {
        messageBuilder.createMessage();
        messageBuilder.constructSender(sender);
        messageBuilder.constructRecipient(recipient);
        messageBuilder.constructMessageHeader();
        messageBuilder.constructMessageBody(message);
        return messageBuilder.getMessage();
    }
}
