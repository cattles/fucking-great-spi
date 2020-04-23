package com.example.fg.sms;

import org.junit.jupiter.api.Test;

class MessageServiceFactoryTest {

    @Test
    void sendMessage() {
        MessageServiceFactory factory = new MessageServiceFactory();
        factory.sendMessage("hello spi");
    }
}