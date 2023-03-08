package com.aypc.creational.builder1;

/** "Abstract Builder" -- Strategy  */
public abstract class MessageBuilder {
    protected Message message;

    public void createMessage() {
	    message = new Message();
	}

	public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public void constructMessage(){
        message = new Message();
    }

    public void constructSender(String sender){
        message.setSender(sender);
    }

    public void constructRecipient(String recipient){
        message.setRecipient(recipient);
    }

    public abstract void constructMessageHeader();
    public abstract void constructMessageBody(String body);
}
