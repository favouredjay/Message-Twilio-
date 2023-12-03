package com.example.demo;

public interface SmsSender {

    default void sendSms(SmsRequest smsRequest) {

    }

}
