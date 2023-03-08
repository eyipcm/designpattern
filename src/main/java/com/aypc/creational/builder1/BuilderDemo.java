package com.aypc.creational.builder1;

public class BuilderDemo {
    public static void main(String[] args){
		//director respond to create product and the the no step 
        ContentProvider contentProvider = new ContentProvider();
		//builder respond inheritance the no of step
        MessageBuilder smsMessageBuilder = new SMSMessageBuilder();
        MessageBuilder mmsMessageBuilder = new MMSMessageBuilder();

        Message sms =
           contentProvider.createMessage(
             smsMessageBuilder, "1234", "5678", "SMS message");
        Message mms =
           contentProvider.createMessage(
             mmsMessageBuilder, "1234", "5678", "MMS message");

        System.out.println(sms.toString());
        System.out.println(mms.toString());
    }
}
